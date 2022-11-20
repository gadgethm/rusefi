#!/bin/bash

I_AM="pinouts-create.sh:"

I_AM="gen_upload_pinouts.sh:"

# yq 3 and 4 have incompatible syntax. We use yq 4.
echo ${I_AM} invoking yq version
yqdir/yq -V

if [ -z $1 ] ; then
  echo "Specific yaml parameter not specified, searching for */connectors/*.yaml"
  CONNECTORS=$(find -path "./firmware/config/boards/*/connectors/*.yaml")
  FILES=$(for f in $CONNECTORS; do
    ORDER=$(yqdir/yq e '.info.order' $f)
    echo "$f $ORDER"
  done)
  CONNECTORS=$(echo "$FILES" | sort -k2 | cut -d ' ' -f 1)
else
  CONNECTORS=$1
  echo "Processing $CONNECTORS"
fi

for c in $CONNECTORS; do
  echo "${I_AM} processing "$c
  DIR="pinouts/"$(echo $c | tr '/' '\n' | tail -n +5 | head -n -2 | tr '\n' '/')
  echo "${I_AM} DIR "$DIR
  NAME=$(basename $c .yaml)
  echo "${I_AM} NAME "$NAME
  mkdir -p $DIR
  if [ "$(yqdir/yq e '.info.id' $c)" == "null" ]; then
    echo "${I_AM} Missing yaml id field in info section of $c"
# todo fail once all pages are compliant    exit 1
  fi
  if [ -f $DIR/index.html ]; then
    bash misc/pinout-gen/append.sh "$(yqdir/yq -j e $c)" $DIR/index.html
  else
    bash misc/pinout-gen/gen.sh "$(yqdir/yq -j e $c)" $DIR/index.html
  fi
  if [ $? -ne 0 ]; then
    echo "${I_AM} something is broken"
    exit 1;
  fi
  file $DIR/index.html
  IMG=$(yqdir/yq e '.info.image.file' $c)
  if [ $? -ne 0 ]; then
    exit 1;
  fi
  echo "IMG "$IMG
  if [ "$IMG" != "null" ]; then
    cp $(dirname $c)/$IMG $DIR
  fi
  ls $DIR
done

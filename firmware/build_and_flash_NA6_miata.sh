# Remove previous build:
rm -rf build/
# Execute board-specific build
make PROJECT_BOARD=hellen/hellen64_miataNA6_94 PROJECT_CPU=ARCH_STM32F4
# Program board in DFU mode
dfu-util -a 0 -D build/rusefi.bin -s 0x08000000
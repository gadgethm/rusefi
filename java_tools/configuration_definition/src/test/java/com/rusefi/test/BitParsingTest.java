package com.rusefi.test;

import com.rusefi.ReaderState;
import com.rusefi.TsFileContent;
import com.rusefi.output.TSProjectConsumer;
import com.rusefi.util.Output;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertTrue;

public class BitParsingTest {
    @Test
    public void testBitParser() {
        ReaderState state = new ReaderState();

        String inputString = "struct pid_s\n" +
                ReaderState.BIT + " fieldName\n" +
                ReaderState.BIT + " fieldName2,\"si\",\"nada\";comment\n" +
                "end_struct\n";

        StringWriter sw = new StringWriter();

        TSProjectConsumer javaFieldsConsumer = new TSProjectConsumer("", state) {
            @Override
            protected void writeTunerStudioFile(String tsPath, String fieldsSection) throws IOException {
                writeContent(fieldsSection, new TsFileContent("", ""), createOutput(sw));
            }
        };
        state.headerMessage = "test";
        state.readBufferedReader(inputString, javaFieldsConsumer);

        System.out.printf("start[" + sw + "]end");

        assertTrue(sw.toString().contains("\"false\", \"true\""));
        assertTrue(sw.toString().contains("\"nada\", \"si\""));
    }

    private Output createOutput(StringWriter sw) {
        return new Output() {
            @Override
            public void write(String line) {
                sw.write(line);
            }

            @Override
            public void close() {

            }
        };
    }
}

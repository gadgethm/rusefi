package com.rusefi;

import com.rusefi.core.RusEfiSignature;
import com.rusefi.core.SignatureHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignatureHelperTest {
    @Test
    public void parseSignature() {
        RusEfiSignature s = SignatureHelper.parse("rusEFI 2021.09.22.all.3378169541");

        assertEquals("all", s.getBundle());
    }
}

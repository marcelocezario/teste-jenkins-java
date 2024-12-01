package br.dev.mhc.testejenkins.tools;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void checkSumNumbers() {
        Assertions.assertEquals(3, Utils.sum(1, 2));
        Assertions.assertEquals(6, Utils.sum(1, 2, 3));
        Assertions.assertEquals(10, Utils.sum(1, 2, 7));
        Assertions.assertEquals(2, Utils.sum(0, 2));

        // Error test
        Assertions.assertEquals(2, Utils.sum(0, 0));

    }
}

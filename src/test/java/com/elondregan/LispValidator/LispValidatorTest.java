package com.elondregan.LispValidator;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

class LispValidatorTest {

    @Test
    public void validateBaseCase(){
        Assertions.assertTrue(LispValidator.validateString("()"));
    }

    @Test
    public void validateEmpty(){
        Assertions.assertTrue(LispValidator.validateString(""));
    }

    @Test
    public void validateOnlyLeft(){
        Assertions.assertFalse(LispValidator.validateString("))))))))))))"));
    }

    @Test
    public void validateOnlyRight(){
        Assertions.assertFalse(LispValidator.validateString("((((((((((("));
    }

    @Test
    public void validateActualLispSnippet(){
       Assertions.assertTrue(LispValidator.validateString("(let ((a 6)\n" +
               "      (b 4))\n" +
               "     (+ a b))"));
    }
}
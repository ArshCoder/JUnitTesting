package com.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Arshjeet");
        Assertions.assertEquals(true,result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Ar");
        Assertions.assertEquals(true,result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenSpChars_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Arsh@jeet");
        Assertions.assertEquals(true,result);
        System.out.println(result);
    }
}
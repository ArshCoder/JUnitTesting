package com.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Arshjeet");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Ar");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenFirstName_WhenSpChars_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Arsh@jeet");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Barkade");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Br");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenLastName_WhenSpChars_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Bar@Kade");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("arshjeet.barkade@bridgeLabz.co.in");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("7756096271");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Password@1");
        Assertions.assertEquals(true, result);
        System.out.println(result);
    }


}

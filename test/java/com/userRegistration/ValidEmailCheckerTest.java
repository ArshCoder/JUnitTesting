package com.userRegistration;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidEmailCheckerTest {
    private final String email;
    private final boolean expectedResult;
    private ValidEmailChecker validEmailChecker;


    @Before
    public void initialize() {
        validEmailChecker = new ValidEmailChecker();
    }

    public ValidEmailCheckerTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;

    }

    @Parameterized.Parameters
    public static Collection emails() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.com",true},
                {"abc@1.com", true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true},
                {"abc", false},
                {"abc@.com.my", false},
                {".abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc.@gmail.com", false},
                {"abc@.abc@gmail.com", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void testValidEmailChecker() {
        System.out.println("Parameterized Email is : " + email);
        assertEquals(expectedResult, validEmailChecker.validate(email));
    }

}
package com.userRegistration;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-z]{1}[a-z]{2,}";
    private static final String EMAIL_PATTERN = "^[a-z]{2,}[.+][a-z]{2,}+@(bridgeLabz.co.)[a-z]{2,3}$";
    private static final String MOBILE_NUM_PATTERN = "(0/91)?[7-9][0-9]{9}";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateMobileNumber(String num) {
        Pattern pattern = Pattern.compile(MOBILE_NUM_PATTERN);
        return pattern.matcher(num).matches();
    }

    public boolean validatePassword(String pass) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(pass).matches();
    }
}

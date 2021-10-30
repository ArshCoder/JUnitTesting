package com.userRegistration;

import java.util.regex.Pattern;


public class ValidEmailChecker {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    public boolean validate(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();

    }
}

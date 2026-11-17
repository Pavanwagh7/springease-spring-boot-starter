package com.pavanwagh.springease.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasCapitalLetter = false;
        boolean hasSmallLetter = false;
        boolean hasSpecialCharacter = false;
        boolean hasNumericValue = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isWhitespace(ch)) {
                return false;
            }

            if (ch >= 'A' && ch <= 'Z') {
                hasCapitalLetter = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasSmallLetter = true;
            } else if (ch >= '0' && ch <= '9') {
                hasNumericValue = true;
            } else {
                hasSpecialCharacter = true;
            }
        }

        return hasCapitalLetter && hasSmallLetter && hasNumericValue && hasSpecialCharacter;
    }
}

package com.pavanwagh.springease.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {

    // Strict email regex disallowing leading/trailing dots or hyphens and requiring a valid TLD
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9](?:[a-zA-Z0-9._%+-]*[a-zA-Z0-9])?@(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,}$"
    );

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null) {
            return false;
        }

        String trimmed = email.trim();
        if (trimmed.isEmpty() || trimmed.contains("..")) {
            return false;
        }

        return EMAIL_PATTERN.matcher(trimmed).matches();
    }
}
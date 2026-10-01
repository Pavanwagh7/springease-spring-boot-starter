
package com.pavanwagh.springease.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        if (phoneNumber == null) return false;

        phoneNumber = phoneNumber.trim();
        
        if (phoneNumber.length() != 10) return false;

        if (phoneNumber.charAt(0) < '6' || phoneNumber.charAt(0) > '9') {
            return false;
        }
        
        for (int i = 1; i < 10;i++) {
            char ch = phoneNumber.charAt(i);
            if (ch < '0' || ch > '9') return false;
        }

        return true;
    }
}
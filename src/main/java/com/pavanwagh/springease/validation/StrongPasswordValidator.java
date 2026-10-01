package com.pavanwagh.springease.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword,String>{
    @Override 
    public boolean isValid (String password,ConstraintValidatorContext contex) {
        if (password == null) return false;

        password = password.trim(); //trim() leading and trailing spaces

        if (password.length()  < 8) return false;

        boolean hasCapitalLetter = false;
        boolean hasSmallLetter = false;
        boolean hasSpecialCharater = false;
        boolean hasNeumericValue = false;
        boolean isPasswordStong = false;
        for (int i = 0;i < password.length();i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') hasCapitalLetter = true;
            else if (ch >= 'a' && ch <= 'z') hasSmallLetter = true; 
            else if (ch >= '0' && ch <= '9') hasNeumericValue = true;
            else hasSpecialCharater = true;

            if (hasCapitalLetter == true && hasSmallLetter == true && hasNeumericValue == true && hasSpecialCharater == true) {
                isPasswordStong = true;
                break;
            }
        }
        return isPasswordStong;
    }
}

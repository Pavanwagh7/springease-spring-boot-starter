package com.pavanwagh.springease.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Valid;

public class TextValidator implements ConstraintValidator<ValidText,String>{
    private int min;
    private int max;
    private boolean allowNumbers;
    private boolean allowSpecialCharacters;
    
    @Override 
    public void initialize(ValidText constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
        this.allowNumbers = constraintAnnotation.allowNumbers();
        this.allowSpecialCharacters = constraintAnnotation.allowSpecialCharacters();
    }

    @Override 
    public boolean isValid (String text,ConstraintValidatorContext context) {
        if (text == null) return false;
        
        text = text.trim();
        
        if (text.isEmpty()) return false;
        
        if (text.length() < min || text.length() > max) return false;

        if (allowNumbers == false) {
            for (int i = 0;i < text.length();i++) {
                if (text.charAt(i) >= '0' && text.charAt(i) <= '9')
                    return false;
            }
        }

        
        if (!allowSpecialCharacters) {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                // Allow character ,space and hypen
                if (Character.isLetter(ch) || ch == ' ' || ch == '-') {
                    continue;
                }
                
                if (allowNumbers && Character.isDigit(ch)) {
                    continue;
                }

                return false;
            }
        }

        return true;
    }
}
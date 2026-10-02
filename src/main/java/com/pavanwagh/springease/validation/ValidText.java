package com.pavanwagh.springease.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

// The annotion
@Documented 
@Constraint(validatedBy = TextValidator.class)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME) 
public @interface ValidText {
    String message() default "Invalid text format. Must be non-blank and within valid length.";
    
    int min() default 1;
    int max() default 255;
    boolean allowNumbers() default false;
    
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

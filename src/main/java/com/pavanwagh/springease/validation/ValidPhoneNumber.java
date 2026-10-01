package com.pavanwagh.springease.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class) // Linked to our validator class
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface  ValidPhoneNumber {

    String message() default "Invalid phone number. Must be a valid 10-digit mobile number.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

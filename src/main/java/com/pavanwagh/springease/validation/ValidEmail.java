package com.pavanwagh.springease.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {

    String message() default "Invalid email format. Must be a well-formed email address (e.g., user@domain.com).";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
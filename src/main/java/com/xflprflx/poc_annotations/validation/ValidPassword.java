package com.xflprflx.poc_annotations.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({FIELD, METHOD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ValidPassword {

    String message() default "Senha no formato inválido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int minLength() default 8;

    boolean requireUppercase() default true;

    boolean requireLowercase() default true;

    boolean requireDigit() default true;

    boolean requireSpecialCharacter() default true;

}

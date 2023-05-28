package az.atl.academy.atl.test1.annotation;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CheckPhoneNumberValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckPhoneNumber {
    String message()default "Invalid phone number";
    Class<?>[] groups()default {};
}

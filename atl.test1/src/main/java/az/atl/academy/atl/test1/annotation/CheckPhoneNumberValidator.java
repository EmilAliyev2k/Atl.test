package az.atl.academy.atl.test1.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckPhoneNumberValidator implements ConstraintValidator<CheckPhoneNumber, String>{

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext context) {
        return contactField.length()==13 && contactField.startsWith("+994");
    }
}

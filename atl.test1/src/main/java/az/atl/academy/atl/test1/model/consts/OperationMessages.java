package az.atl.academy.atl.test1.model.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OperationMessages {
    GREETINGS("greetings"), VALID_PHONENUMBER("valid.phoneNUmber"), USER_NOT_FOUND("student.notFound");

    private final String message;
}


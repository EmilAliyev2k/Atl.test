package az.atl.academy.atl.test1.model.dto;

import az.atl.academy.atl.test1.annotation.CheckPhoneNumber;
import com.opencsv.bean.validators.StringValidator;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentDto {
    Long id;
    String studentId;
    @NotNull(message = "{valid.fullName}")
    String fullName;
    @CheckPhoneNumber(groups = StringValidator.class,message = "Nomre xetalidir!")
    String phoneNumber;
    String email;
    Integer age;
}

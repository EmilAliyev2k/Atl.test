package az.atl.academy.atl.test1.model.builder;

import az.atl.academy.atl.test1.dao.entity.StudentEntity;
import az.atl.academy.atl.test1.model.dto.StudentDto;


public enum StudentBuilder {
    STUDENT_BUILDER;
    public final StudentEntity buildEntity(StudentDto studentDto) {
        return StudentEntity.builder()
                .id(studentDto.getId())
                .studentId(studentDto.getStudentId())
                .fullName(studentDto.getFullName())
                .email(studentDto.getEmail())
                .age(studentDto.getAge()).build();
    }

    public final StudentDto buildDto(StudentEntity entity) {
        return StudentDto.builder()
                .id(entity.getId())
                .studentId(entity.getStudentId())
                .fullName(entity.getFullName())
                .phoneNumber(entity.getPhoneNumber())
                .age(entity.getAge()).build();
    }
}
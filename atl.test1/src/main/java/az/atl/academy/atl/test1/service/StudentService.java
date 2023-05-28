package az.atl.academy.atl.test1.service;

import az.atl.academy.atl.test1.model.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void createStudent(StudentDto studentDto);

    StudentDto getById(Long id);

    List<StudentDto> getAll();

    void deleteById(Long id);
}

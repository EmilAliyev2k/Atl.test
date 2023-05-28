package az.atl.academy.atl.test1.controller;

import az.atl.academy.atl.test1.model.dto.StudentDto;
import az.atl.academy.atl.test1.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Validated @RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public StudentDto getById(@RequestParam Long id) {
        return studentService.getById(id);
    }

}

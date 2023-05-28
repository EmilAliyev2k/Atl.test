package az.atl.academy.atl.test1.service.impl;

import az.atl.academy.atl.test1.dao.repo.StudentRepository;
import az.atl.academy.atl.test1.model.dto.StudentDto;
import az.atl.academy.atl.test1.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

import static az.atl.academy.atl.test1.model.builder.StudentBuilder.STUDENT_BUILDER;
import static az.atl.academy.atl.test1.model.consts.OperationMessages.GREETINGS;
import static az.atl.academy.atl.test1.model.consts.OperationMessages.USER_NOT_FOUND;

@Service
@AllArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {
    private final MessageSource messageSource;
    private final StudentRepository studentRepository;
    @Override
    public void createStudent(StudentDto studentDto) {
        Locale locale = LocaleContextHolder.getLocale();
        log.info("Locale: " + locale);
        Object[] objs = new Object[2];
        objs[0] = studentDto.getFullName();
        objs[1] = studentDto.getStudentId();
        String message = messageSource.getMessage(GREETINGS.getMessage(), objs, locale);
        log.info("Message: " + message);

        var studentEntity = STUDENT_BUILDER.buildEntity(studentDto);
        studentRepository.save(studentEntity);

        log.info("Student created: " + studentDto);
    }



    @Override
    public StudentDto getById(Long id) {
        Locale locale = LocaleContextHolder.getLocale();
        var entity = studentRepository.findById(id);
        if (entity.isPresent())
            return STUDENT_BUILDER.buildDto(entity.get());

        Object[] objs2 = new Object[1];
        objs2[0] = id;
        throw new RuntimeException(messageSource.getMessage(USER_NOT_FOUND.getMessage(), objs2, locale));
    }


    @Override
    public List<StudentDto> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

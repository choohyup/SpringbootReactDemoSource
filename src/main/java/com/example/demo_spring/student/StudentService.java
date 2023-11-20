package com.example.demo_spring.student;

import com.example.demo_spring.EmailValidator;
import com.example.demo_spring.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDataAccessService studentDataAccessService;
    private final EmailValidator emailValidator;

    @Autowired
    public StudentService(StudentDataAccessService studentDataAccessService, EmailValidator emailValidator) {
        this.studentDataAccessService = studentDataAccessService;
        this.emailValidator = emailValidator;
    }

    public List<Student> getAllStudents(){
        return studentDataAccessService.selectAllStudents();
    }

    public void addNewStudent(Student student) {

        // TODO: Validate studentId, email
        if (!emailValidator.test(student.getEmail())){
            throw new ApiRequestException(student.getEmail() + "is not valid");
        }
        //TODO: Verify that email is not taken

        studentDataAccessService.insertStudent(student);

    }
}

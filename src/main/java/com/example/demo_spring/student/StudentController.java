package com.example.demo_spring.student;

import com.example.demo_spring.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getAllStudents(){
        throw new ApiRequestException("Oops cannot get all students with custom");
//        throw new IllegalStateException("Oops cannot get all student");
//        return studentService.getAllStudents();
    }


    @PostMapping
    public void addNewStudent(@RequestBody @Valid Student student){
        studentService.addNewStudent(student);

    }
}

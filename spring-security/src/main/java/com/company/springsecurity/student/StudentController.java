package com.company.springsecurity.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Anar", 19),
            new Student(2, "Tural", 18),
            new Student(3, "Tural", 17)
    );

    @GetMapping(path = "{studentId}")
    public Student getStudentById(@PathVariable(value = "studentId") Integer studentId) {
        return
                STUDENTS
                        .stream()
                        .filter(student -> student.getStudentId() == studentId)
                        .findFirst()
                        .orElseThrow();
    }
}

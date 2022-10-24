package com.company.springsecurity.student;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Anar", 19),
            new Student(2, "Tural", 18),
            new Student(3, "Tural", 17)
    );

    @GetMapping
    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println("registerNewStudent. " + student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable(value = "studentId") Integer studentId) {
        System.out.println("deleteStudent. " + studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable(value = "studentId") Integer studentId, @RequestBody Student student) {
        System.out.println("updateStudent. " + studentId + " . " + student);
    }
}

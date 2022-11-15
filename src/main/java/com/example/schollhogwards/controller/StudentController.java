package com.example.schollhogwards.controller;

import com.example.schollhogwards.entity.StudentParam;
import com.example.schollhogwards.model.Student;
import com.example.schollhogwards.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping//POST  http://localhost:8080/student
    public Student create(@RequestBody Student student) {
        return studentService.create(student);

    }

    @GetMapping("/{id}")//GET
    public Student read(@PathVariable long id) {
        return studentService.read(id);


    }

    @PutMapping("/{id}")//PUT
    public ResponseEntity<Student> update(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.update(student));
    }


    @DeleteMapping("/{id}")//DELETE
    public void delete(@PathVariable long id) {
        studentService.delete(id);

    }

    @GetMapping
    public Collection<Student> finBydAllStudents() {
        return studentService.getAll();
    }

    @GetMapping("/age")
    public Collection<Student> getAgeStudent(int age) {
        return studentService.getAgeStudent(age);
    }

    @GetMapping("/minMax")
    public Collection<Student> findMinMax(int age, int age2) {
        return studentService.findMinMax(age, age2);
    }


    @GetMapping("/sum")
    public List<StudentParam> getSum(long id) {
        return studentService.getSum(id);
    }

    @GetMapping("/facultyStudent")
    public Collection<Student> getStudentFaculty(long id) {
        return studentService.getStudentFaculty(id);
    }

}


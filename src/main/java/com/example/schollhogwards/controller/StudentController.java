package com.example.schollhogwards.controller;

import com.example.schollhogwards.model.Student;
import com.example.schollhogwards.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.create(student);

    }

    @GetMapping("/{id}")
    public Student read(@PathVariable long id) {
        return studentService.read(id);


    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@RequestBody long id, Student student) {
        Student foundBook = studentService.update(student);
        if (foundBook == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(foundBook);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        studentService.delete(id);

    }

    @GetMapping
    public Collection<Student> findByAge(@RequestParam int age) {
        return studentService.findByAge(age);
    }
}

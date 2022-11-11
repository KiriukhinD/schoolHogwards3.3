package com.example.schollhogwards.service;

import com.example.schollhogwards.model.Student;
import com.example.schollhogwards.repository.RepositoryStudent;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    private final RepositoryStudent repositoryStudent;

    public StudentService(RepositoryStudent repositoryStudent) {
        this.repositoryStudent = repositoryStudent;
    }

    public Student create(Student student) {
        return repositoryStudent.save(student);
    }

    public Student read(long id) {
        return repositoryStudent.findById(id).get();
    }

    public Student update(Student student) {
        return repositoryStudent.save(student);
    }

    public ResponseEntity delete(long id) {
        repositoryStudent.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public Collection<Student> getAll() {
        return repositoryStudent.findAll();
    }

    public Collection<Student> getAgeStudent(int age) {
        return repositoryStudent.findByAge(age);
    }

    public Collection<Student> findMinMax(int age, int age2) {
        return repositoryStudent.findByAgeBetween(age, age2);
    }

}

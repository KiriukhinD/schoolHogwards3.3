package com.example.schollhogwards.service;

import com.example.schollhogwards.model.Student;
import com.example.schollhogwards.repository.PositionRepositoryStudent;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class StudentService {
    private final PositionRepositoryStudent positionRepositoryStudent;

    public StudentService(PositionRepositoryStudent positionRepositoryStudent) {
        this.positionRepositoryStudent = positionRepositoryStudent;
    }

    public Student create(Student student) {
        return positionRepositoryStudent.save(student);
    }

    public Student read(long id) {
        return positionRepositoryStudent.findById(id).get();
    }

    public Student update(Student student) {
        return positionRepositoryStudent.save(student);
    }

    public ResponseEntity delete(long id) {
        positionRepositoryStudent.deleteById(id);
        return ResponseEntity.ok().build();
    }


    public Collection<Student> findByAge(int age) {
        return positionRepositoryStudent.findStudentByAge(age);
    }


}

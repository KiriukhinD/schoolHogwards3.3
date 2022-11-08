package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface PositionRepositoryStudent extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);
}

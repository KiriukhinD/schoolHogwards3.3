package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


public interface RepositoryStudent extends JpaRepository<Student, Long> {
    Collection<Student> findByAge(int age);

    Collection<Student> findByAgeBetween(int age, int age2);


}

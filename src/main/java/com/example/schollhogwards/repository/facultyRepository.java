package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Faculty;
import com.example.schollhogwards.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface facultyRepository extends JpaRepository<Faculty, Long> {
  Collection<Faculty> findByNameFacultyIgnoreCaseOrColorIgnoreCase(String name, String color);

  Collection<Student> findByStudentsId(long id);

}

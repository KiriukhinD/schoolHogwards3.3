package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface RepositoryFaculty extends JpaRepository<Faculty, Long> {
  Collection<Faculty> findByNameFacultyIgnoreCaseOrColorIgnoreCase(String name, String color);

  Collection<Faculty> findByStudentsId(long id);

}

package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RepositoryFaculty extends JpaRepository<Faculty, Long> {
  Collection<Faculty> findByNameFacultyIgnoreCaseOrColorIgnoreCase(String name, String color);

  Collection<Faculty> findByStudentsId(long id);

}

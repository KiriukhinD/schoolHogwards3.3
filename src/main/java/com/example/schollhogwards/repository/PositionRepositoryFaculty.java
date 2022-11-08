package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface PositionRepositoryFaculty extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findByColor(String color);
}

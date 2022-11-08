package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepositoryFaculty extends JpaRepository<Faculty, Long> {
}

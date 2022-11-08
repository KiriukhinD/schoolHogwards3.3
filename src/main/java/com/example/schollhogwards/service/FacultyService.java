package com.example.schollhogwards.service;

import com.example.schollhogwards.model.Faculty;
import com.example.schollhogwards.repository.PositionRepositoryFaculty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FacultyService {
    private final PositionRepositoryFaculty positionRepositoryFaculty;

    public FacultyService(PositionRepositoryFaculty positionRepositoryFaculty) {
        this.positionRepositoryFaculty = positionRepositoryFaculty;
    }

    public Faculty create(Faculty faculty) {
        return positionRepositoryFaculty.save(faculty);
    }

    public Faculty read(long id) {
        return positionRepositoryFaculty.findById(id).get();
    }

    public Faculty update(Faculty faculty) {
        return positionRepositoryFaculty.save(faculty);
    }

    public ResponseEntity<Faculty> delete(long id) {
        positionRepositoryFaculty.deleteById(id);
        return ResponseEntity.ok().build();
    }


    public Collection<Faculty> findByColor(String color) {
        return positionRepositoryFaculty.findByColor(color);
    }


}

package com.example.schollhogwards.service;

import com.example.schollhogwards.model.Faculty;
import com.example.schollhogwards.repository.RepositoryFaculty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FacultyService {
    private final RepositoryFaculty repositoryFaculty;

    public FacultyService(RepositoryFaculty repositoryFaculty) {
        this.repositoryFaculty = repositoryFaculty;
    }

    public Faculty create(Faculty faculty) {
        return repositoryFaculty.save(faculty);
    }

    public Faculty read(long id) {
        return repositoryFaculty.findById(id).get();
    }

    public Faculty update(Faculty faculty) {
        return repositoryFaculty.save(faculty);
    }

    public ResponseEntity<Faculty> delete(long id) {
        repositoryFaculty.deleteById(id);
        return ResponseEntity.ok().build();
    }


    public Collection<Faculty> findByNameOrColor(String name, String color) {
        return repositoryFaculty.findByNameIgnoreCaseOrColorIgnoreCase(name, color);
    }

    public Collection<Faculty> getAll() {
        return repositoryFaculty.findAll();
    }
}

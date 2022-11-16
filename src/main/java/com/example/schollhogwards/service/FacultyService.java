package com.example.schollhogwards.service;

import com.example.schollhogwards.model.Faculty;
import com.example.schollhogwards.model.Student;
import com.example.schollhogwards.repository.facultyRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class FacultyService {
    private final facultyRepository facultyRepository;

    public FacultyService(facultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty create(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty read(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty update(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public ResponseEntity<Faculty> delete(long id) {
        facultyRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


    public Collection<Faculty> findByNameOrColor(String name, String color) {
        return facultyRepository.findByNameFacultyIgnoreCaseOrColorIgnoreCase(name, color);
    }

    public Collection<Faculty> getAll() {
        return facultyRepository.findAll();
    }

    public Collection<Student> getFacultyStudent(long id) {
        return facultyRepository.findByStudentsId(id);
    }
}

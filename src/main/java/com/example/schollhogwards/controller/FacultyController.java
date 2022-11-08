package com.example.schollhogwards.controller;


import com.example.schollhogwards.model.Faculty;
import com.example.schollhogwards.service.FacultyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/faculty")
public class FacultyController {
    public final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }


    @PostMapping
    public Faculty create(@RequestBody Faculty faculty) {
        return facultyService.create(faculty);
    }

    @GetMapping("{id}")
    public Faculty read(@PathVariable long id) {
        return facultyService.read(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Faculty> update(@RequestBody Faculty faculty) {
        Faculty faculty1 = facultyService.update(faculty);
        if (faculty1 == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty1);

    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable long id) {
        facultyService.delete(id);

    }


    @GetMapping
    public Collection<Faculty> findByColor(@RequestParam String color) {
        return facultyService.findByColor(color);
    }


}

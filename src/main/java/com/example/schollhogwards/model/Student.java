package com.example.schollhogwards.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Student {
    private String name;
    private int age;
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "students_id")
    private Faculty faculty;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && id == student.id && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, faculty);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", faculty=" + faculty +
                '}';
    }


}

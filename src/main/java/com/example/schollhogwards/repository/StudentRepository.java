package com.example.schollhogwards.repository;

import com.example.schollhogwards.entity.StudentParam;
import com.example.schollhogwards.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findAllByAge(int age);

    Collection<Student> findByAgeBetween(int age, int age2);

    Collection<Student> findStudentByName(String name);

    @Query(value = "select student.name, student.id,faculty.name_faculty from student,faculty where student.name_student_id = faculty.id;", nativeQuery = true)
    Collection<StudentParam> findByStudentId(long id);

    Collection<Student> findByFacultyId(long id);


}

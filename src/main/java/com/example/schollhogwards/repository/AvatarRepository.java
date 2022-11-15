package com.example.schollhogwards.repository;

import com.example.schollhogwards.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AvatarRepository extends JpaRepository<AvatarRepository, Long> {
    Optional<Avatar> findByStudentId(Long studentId);


}

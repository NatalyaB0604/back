package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Integer> {
}

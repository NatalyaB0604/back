package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments, Integer>{
}

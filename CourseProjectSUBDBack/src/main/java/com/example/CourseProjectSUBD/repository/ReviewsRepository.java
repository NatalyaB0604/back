package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer>{
}

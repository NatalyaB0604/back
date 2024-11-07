package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer>{
}

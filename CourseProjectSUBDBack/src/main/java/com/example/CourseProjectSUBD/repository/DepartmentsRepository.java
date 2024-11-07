package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Integer>{
}

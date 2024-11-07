package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{
}

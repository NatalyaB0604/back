package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer>{
}

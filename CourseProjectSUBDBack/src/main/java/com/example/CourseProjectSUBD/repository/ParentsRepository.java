package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Integer>{
}

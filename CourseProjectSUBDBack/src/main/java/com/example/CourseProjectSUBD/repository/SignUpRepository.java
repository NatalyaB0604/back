package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp, Integer>{
}

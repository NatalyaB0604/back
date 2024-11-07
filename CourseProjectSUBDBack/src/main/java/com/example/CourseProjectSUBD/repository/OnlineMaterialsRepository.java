package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.OnlineMaterials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineMaterialsRepository extends JpaRepository<OnlineMaterials, Integer>{
}

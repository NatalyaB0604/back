package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Integer> {
}

package com.example.CourseProjectSUBD.repository;

import com.example.CourseProjectSUBD.entity.TextBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextBooksRepository extends JpaRepository<TextBooks, Integer>{
}

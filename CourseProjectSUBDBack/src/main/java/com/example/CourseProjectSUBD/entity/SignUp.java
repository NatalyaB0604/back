package com.example.CourseProjectSUBD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "signUp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SignUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SignUpId")
    private Integer signUpId;

}

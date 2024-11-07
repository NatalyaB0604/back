package com.example.CourseProjectSUBD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name="parents")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ParentID")
    private Integer parentId;

    @Column(name = "Name")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Login", length = 100, unique = true)
    private String login;

    @Column(name = "Password", length = 250)
    private String password;

    @Column(name = "PhoneNumber", length = 13)
    private String phoneNumber;

    @Column(name = "Email", length = 100)
    private String email;
}

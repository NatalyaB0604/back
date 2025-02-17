package com.example.CourseProjectSUBD.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "onlinematerials")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OnlineMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OnlineMaterialID")
    private Integer materialId;

    @Column(name = "Name", length = 255, nullable = false)
    private String materialName;

    @Column(name = "Link", length = 500)
    private String link;

    @ManyToOne
    @JoinColumn(name = "ClassID", referencedColumnName = "ClassID", nullable = false)
    private Classes schoolClass;
}

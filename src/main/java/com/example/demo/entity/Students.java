package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="students_table")
@Data
@NoArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;

    @Column
    private String first_name;

    @Column
    private String middle_name;

    @Column
    private String last_name;

    @Column
    private String speciality;

    @Column
    private Integer course;
}

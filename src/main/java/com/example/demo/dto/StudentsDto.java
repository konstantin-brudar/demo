package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentsDto {
    private Integer student_id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String speciality;
    private Integer course;
}

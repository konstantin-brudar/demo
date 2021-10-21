package com.example.demo.controller;

import com.example.demo.dto.StudentsDto;
import com.example.demo.service.StudentsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
@Log
public class StudentsController {
    private final StudentsService studentsService;

    @PostMapping("/save")
    public StudentsDto saveStudents(@RequestBody StudentsDto studentsDto) {
        log.info("Handling save student: " + studentsDto);
        return studentsService.saveStudent(studentsDto);
    }
}

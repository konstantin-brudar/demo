package com.example.demo.service;

import com.example.demo.dto.StudentsDto;
import com.example.demo.entity.Students;
import com.example.demo.repository.StudentsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DefaultStudentsService implements StudentsService {
    private final StudentsRepository studentsRepository;
    private final StudentsConverter studentsConverter;

    @Override
    public StudentsDto saveStudent(StudentsDto studentsDto) {
        Students savedStudent = studentsRepository.save(studentsConverter.fromStudentsDtoToStudents(studentsDto));
        return studentsConverter.fromStudentsToStudentsDto(savedStudent);
    }

//    @Override
//    public void deleteStudent(Integer studentId) {
//        studentsRepository.deleteById(studentId);
//    }
}

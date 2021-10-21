package com.example.demo.service;

import com.example.demo.dto.StudentsDto;
import com.example.demo.entity.Students;
import org.springframework.stereotype.Component;

@Component
public class StudentsConverter {

    public Students fromStudentsDtoToStudents(StudentsDto studentsDto) {
        Students students = new Students();
        students.setStudent_id(studentsDto.getStudent_id());
        students.setFirst_name(studentsDto.getFirst_name());
        students.setMiddle_name(studentsDto.getMiddle_name());
        students.setLast_name(studentsDto.getLast_name());
        students.setSpeciality(studentsDto.getSpeciality());
        students.setCourse(studentsDto.getCourse());
        return students;
    }

    public StudentsDto fromStudentsToStudentsDto(Students students) {
        return StudentsDto.builder()
                .student_id(students.getStudent_id())
                .first_name(students.getFirst_name())
                .middle_name(students.getMiddle_name())
                .last_name(students.getLast_name())
                .speciality(students.getSpeciality())
                .course(students.getCourse())
                .build();
    }
}

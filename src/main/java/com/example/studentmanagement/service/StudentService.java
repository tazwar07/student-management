package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long studentId);

    Student saveStudent(Student student);

    void deleteStudent(Long studentId);

    // Other methods...
}

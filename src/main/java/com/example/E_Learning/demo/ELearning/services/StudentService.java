package com.example.E_Learning.demo.ELearning.services;
import java.util.List;

import com.example.E_Learning.demo.ELearning.models.Student;

public interface StudentService {
    Student save(Student student);
    List<Student> findAll();
    Student findById(Long id);
    void deleteById(Long id);
}


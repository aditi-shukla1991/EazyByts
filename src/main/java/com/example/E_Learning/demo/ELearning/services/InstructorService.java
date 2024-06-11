package com.example.E_Learning.demo.ELearning.services;



import java.util.List;

import com.example.E_Learning.demo.ELearning.models.Instructor;

public interface InstructorService {
    Instructor save(Instructor instructor);
    List<Instructor> findAll();
    Instructor findById(Long id);
    void deleteById(Long id);
}


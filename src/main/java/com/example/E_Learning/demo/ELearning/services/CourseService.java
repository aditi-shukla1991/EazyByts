package com.example.E_Learning.demo.ELearning.services;



import java.util.List;

import com.example.E_Learning.demo.ELearning.models.Course;

public interface CourseService {
    Course save(Course course);
    List<Course> findAll();
    Course findById(Long id);
    void deleteById(Long id);
}


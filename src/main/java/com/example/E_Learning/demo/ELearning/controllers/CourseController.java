package com.example.E_Learning.demo.ELearning.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.E_Learning.demo.ELearning.models.Course;
import com.example.E_Learning.demo.ELearning.services.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/getAll")
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course) {
        return courseService.save(course);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteById(id);
    }
}

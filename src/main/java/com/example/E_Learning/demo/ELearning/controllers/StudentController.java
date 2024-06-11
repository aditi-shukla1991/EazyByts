package com.example.E_Learning.demo.ELearning.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.E_Learning.demo.ELearning.models.Course;
import com.example.E_Learning.demo.ELearning.models.Student;
import com.example.E_Learning.demo.ELearning.services.CourseService;
import com.example.E_Learning.demo.ELearning.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @GetMapping("/{id}/courses")
    public List<Course> getCoursesByStudent(@PathVariable Long id) {
        Student student = studentService.findById(id);
        return student.getCourses();
    }

    @PostMapping("/{id}/courses")
    public Student enrollInCourse(@PathVariable Long id, @RequestBody Long courseId) {
        Student student = studentService.findById(id);
        Course course = courseService.findById(courseId);
        student.getCourses().add(course);
        return studentService.save(student);
    }
}


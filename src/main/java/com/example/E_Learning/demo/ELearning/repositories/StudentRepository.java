package com.example.E_Learning.demo.ELearning.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.E_Learning.demo.ELearning.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}


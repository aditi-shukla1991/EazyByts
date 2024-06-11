package com.example.E_Learning.demo.ELearning.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Learning.demo.ELearning.models.Instructor;
import com.example.E_Learning.demo.ELearning.repositories.InstructorRepository;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public Instructor save(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    @Override
    public Instructor findById(Long id) {
        return instructorRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        instructorRepository.deleteById(id);
    }

	
}

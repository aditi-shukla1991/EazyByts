package com.example.E_Learning.demo.ELearning.services;


import java.util.List;

import com.example.E_Learning.demo.ELearning.models.User;



public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(Long id);
    void deleteById(Long id);
}

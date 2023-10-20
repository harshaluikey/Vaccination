package com.example.Vaccination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Vaccination.model.UserModel;
import com.example.Vaccination.repository.UserRepo;

@Service
public class UserService2 implements UserService1{

    @Autowired
    UserRepo repo;

    @Override
    public UserModel addUserModel(UserModel user) {
        UserModel r = repo.save(user);
        return r;
    }

    @Override
    public List<UserModel> getAllUserModels() {
        return repo.findAll();
    }
    
}

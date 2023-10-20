package com.example.Vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Vaccination.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{
    
}

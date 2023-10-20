package com.example.Vaccination.service;

import java.util.List;

import com.example.Vaccination.model.UserModel;

public interface UserService1 {
    public UserModel addUserModel(UserModel user);

    public List<UserModel> getAllUserModels();
}

package com.example.Vaccination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Vaccination.model.UserModel;
import com.example.Vaccination.service.UserService2;

@Controller
public class controller1 {

    @Autowired
    UserService2 service;

    @GetMapping("/index")
    public String pg1() {
        return "index";
    }

    //for insertion operation
    @PostMapping("/index1")
    public String pg1(@ModelAttribute UserModel a) {
        System.out.println(a);

        UserModel userm = service.addUserModel(a);

        return "index";
    }

    //for selection operation (result in console)
    @GetMapping("/registrations")
    public String getAllRegisters() {
        List<UserModel> users = service.getAllUserModels();
        users.forEach(data -> System.out.println(data.toString()));
        return "redirect:/index";
    }
}

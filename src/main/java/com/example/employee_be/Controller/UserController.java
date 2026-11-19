package com.example.employee_be.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_be.Model.User;
import com.example.employee_be.Respository.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin (origins = "*")
public class UserController {
    @Autowired
    private UserRepository userepo;

    @PostMapping("/signup")
    public String userSignUp(@RequestBody User u) {
        userepo.save(u);
        return "successfull sig up..";
    }
}

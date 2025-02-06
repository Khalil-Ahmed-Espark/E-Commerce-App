package com.khalil.ecommerce.controller;

import com.khalil.ecommerce.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public String register(@RequestBody Customer user){

        System.out.println(user);
        service.addUser(user);
        return "The User has been registered Successfully";
    }
}

package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.dbService.Film;
import com.example.demo.dbService.FilmService;
import com.example.demo.dbService.User;
import com.example.demo.dbService.UserService;

import org.springframework.ui.Model; 

@Controller
@RequestMapping("films")
public class SecurityController{
    
    @Autowired
    private UserService userService;    

    @GetMapping("/auth/signup")
    public String SingUp(Model model) {

        return "signup";
    }
    @GetMapping("/auth/login")
    public String LogIn(Model model) {

        return "login";
    }
}

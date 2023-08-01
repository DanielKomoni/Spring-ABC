package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Security.PasswordHash;
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
    
    @PostMapping("/auth/signup")
    public String SingUp(@RequestParam String username, @RequestParam String password,@RequestParam String email, Model model) {
        if (userService.findByUsername(username) != null) { 
            model.addAttribute("message", true);
            return "signup";
        }
        String hashedPassword=PasswordHash.hashPassword(password);


        //якщо не забудеш зроби конструктор
        User user = new User();
        user.setUsername(username);
        user.setPassword(hashedPassword);
        user.setEmail(email);
        user.setRole("ROLE_USER");
        userService.createUser(user);
        return "redirect:/films/auth/login";
    }
}

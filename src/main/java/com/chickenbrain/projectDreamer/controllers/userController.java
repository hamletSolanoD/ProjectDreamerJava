package com.chickenbrain.projectDreamer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chickenbrain.projectDreamer.models.DreamUser;
import com.chickenbrain.projectDreamer.repositories.userRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class userController {

    @Autowired
    userRepository userRepo;

    @GetMapping("/")
    public String inicio() {
        return "login"; // Nombre de la plantilla Thymeleaf
    }

    @PostMapping("/login")
    public String iniciosesion(@RequestParam("email") String email, @RequestParam("password") String password,
            HttpServletRequest request, Model model) {
        DreamUser dreamUser = userRepo.findByEmail(email);
        if (dreamUser == null) {
            model.addAttribute("emailError", true);
            return "login";
        }
        if (!dreamUser.getPassword().equals(password)) {
            model.addAttribute("passwordError", true);
            return "login";
        }

        return "redirect:/entradadelportal";
    }
}

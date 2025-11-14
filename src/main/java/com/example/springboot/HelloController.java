package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @Value("${message:Greetings from Spring Boot!}")
    private String message;
    
    @GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", message);
        System.out.println("Accessed the welcome page.");
		return "welcome";
	}
}

package com.example.frontend.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {

    // http://localhost:9090/
    // http://localhost:9090/user
    @GetMapping(value={"/", "/user"})
    public String userPage() {

        System.out.println("Inside userPage");

        // Look in folder resources/templates for users.html
        return "user";
    }
}


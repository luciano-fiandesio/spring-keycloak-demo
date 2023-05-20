package com.lucianofiandesio.keycloakauthdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String getHome() {
        System.out.println("Entering protected...");
        return "home";
    }

    @GetMapping("/protected")
    public String getProtectedResource() {
        System.out.println("Entering protected...");
        return "protected";
    }

    @GetMapping("/public")
    public String getPublicResource() {

        return "public";
    }


}

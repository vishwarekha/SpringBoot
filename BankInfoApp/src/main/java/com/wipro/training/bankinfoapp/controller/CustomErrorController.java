package com.wipro.training.bankinfoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class CustomErrorController {

    @RequestMapping("/custom-error")
    public String handleError(HttpServletRequest request) {
        return "An error has occurred. Please check and correct your request!";
    }
}

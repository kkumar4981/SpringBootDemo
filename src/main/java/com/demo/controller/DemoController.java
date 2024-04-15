package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/health")
    public String checkHealth() {
        LOGGER.info("Demo Application Up and Running.....");
        return "Demo Application Up and Running";
    }

    @GetMapping("/fullName")
    public String getFullName(@RequestParam String firstName, @RequestParam String lastName) {
        LOGGER.info("Received request with firstName: {} and lastName: {}", firstName, lastName);
        return firstName + " " + lastName;
    }

}

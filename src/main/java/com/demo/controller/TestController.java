package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class TestController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/test") // Changed to @GetMapping and added path
    @ResponseBody
    public String requestMethodName() {
        return "exampleView";
    }

    // Create
    @PostMapping("/addEmployee")
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

}

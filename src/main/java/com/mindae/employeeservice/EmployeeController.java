package com.mindae.employeeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employees")
    String getEmployees() {
        return ", 2this is employee list from employee service";
    }
}

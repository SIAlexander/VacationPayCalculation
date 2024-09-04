package com.example.vacationpaycalculation.controller;

import com.example.vacationpaycalculation.model.Employee;
import com.example.vacationpaycalculation.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<?> calculatePay(Employee employee) {
        return ResponseEntity.ok(employeeService.calculatePay(employee));
    }
}

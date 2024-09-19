package com.example.vacationpaycalculation.service;

import com.example.vacationpaycalculation.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeServiceImplTests {
    EmployeeService employeeService = new EmployeeServiceImpl();

    @Test
    void calculatePay() {
        Employee employee = new Employee(50000.0, 10);
        double expected = 50000.0 / 29.3 * 10;
        double actual = employeeService.calculatePay(employee);
        assertEquals(expected, actual);
    }
}

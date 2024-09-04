package com.example.vacationpaycalculation.service;

import com.example.vacationpaycalculation.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Double calculatePay(Employee employee) {
        double averageWorkingDaysInMonth = 29.3;
        double averageSalary = employee.getAverageSalary();
        double vacationDays = employee.getVacationDays();
        return averageSalary / averageWorkingDaysInMonth * vacationDays;
    }
}

package com.example.vacationpaycalculation.model;

import java.util.Objects;

public class Employee {
    private double averageSalary;
    private int vacationDays;

    public Employee(double averageSalary, int vacationDays) {
        this.averageSalary = averageSalary;
        this.vacationDays = vacationDays;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return averageSalary == employee.averageSalary && vacationDays == employee.vacationDays;
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageSalary, vacationDays);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "averageSalary=" + averageSalary +
                ", vacationDays=" + vacationDays +
                '}';
    }
}

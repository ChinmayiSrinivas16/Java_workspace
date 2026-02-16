package com.example;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestEmployee
{
    @Test
    void testProgrammerSalaryIncrease() {
        Employee emp = new Employee(1, "Test", 50000, "Programmer", 30);
        emp.calculateSalary();

        assertEquals(55000, emp.getSalary(), 0.01);
    }

    @Test
    void testDesignerSalaryIncrease() {
        Employee emp = new Employee(2, "Test", 50000, "Designer", 30);
        emp.calculateSalary();

        assertEquals(60000, emp.getSalary(), 0.01);
    }

    @Test
    void testSalaryDeductionForExtraLeaves() {
        Employee emp = new Employee(3, "Test", 30000, "Programmer", 35);
        emp.calculateSalary();

        assertEquals(29700, emp.getSalary(), 0.01);
    }

    @Test
    void testNoDeductionWhenLeavesWithinLimit() {
        Employee emp = new Employee(4, "Test", 40000, "Designer", 20);
        emp.calculateSalary();

        assertEquals(48000, emp.getSalary(), 0.01);
    }
}
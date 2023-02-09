/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gili.mod2inclass;

/**
 *
 * @author itlabs
 */
public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Mike","Smith",60000);
        emp1.setSalary(100000.0);
        
        System.out.println("Employee 1's current salary is:" + emp1.getSalary());
        System.out.println("Employee 2's current salary is:" + emp2.getSalary());
        emp1.setSalary(emp1.getSalary() * 1.1);
        emp2.setSalary(emp2.getSalary() * 1.1);
        System.out.println("After a 10% raise Employee 1's salary is:" + String.format("%.2f",emp1.getSalary()));
        System.out.println("After a 10% raise Employee 2's salary is:" + String.format("%.2f",emp2.getSalary()));
    
    
        
        
        
    }
}

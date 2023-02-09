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
public class Employee {
    private String fname;
    private String lname;
    private double salary;

    //Netbeans Generated Constructor
    /**public Employee(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }*/
    public Employee(){
        fname = "none";
        lname = "none";
        salary = 0.0;
    }
    
    public Employee(String fn, String ln, double s){
        fname = fn;
        lname = ln;
        salary = s;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0){
            this.salary = salary;
        }
        else {
            this.salary = 0.0;
        }
    }
    
    
    
    
}

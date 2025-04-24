package com.pluralsight;

public class Employee {
    private String employeeId = "";
    private String name = "";
    private double hoursWorked = 0;
    private double payRate = 0;
    private double grossPay = 0;

    public Employee(String employeeId, String name, double hoursWorked, double payRate, double grossPay) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.grossPay = grossPay;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay(){
        double grossPayCheck = hoursWorked * payRate;
        return grossPayCheck;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }
}

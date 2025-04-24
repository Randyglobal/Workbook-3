package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class PayRollCalculator {
    static Scanner scanner = new Scanner(System.in);
    static public String employeeId;
    static public String name;
    static public double hoursWorked;
    static public double payRate;
    static public double grossPay;
    static String[] inputArray;


    public static void main(String[] args) {
        fileReader();
    }
    public static void fileReader(){
        try {
            FileReader fileReader = new FileReader("DataFiles\\employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String headerLine = bufferedReader.readLine();

            String input;

            while ((input = bufferedReader.readLine()) != null){
                inputArray = input.split("\\|");
                System.out.println(Arrays.toString(inputArray));
                System.out.println(inputArray[0]);

                Employee employee = token();
                assignToken(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    public static String display( String message){
        System.out.println(message);
        return message;
    }
    public static Employee token(){
        employeeId = inputArray[0];
        name = inputArray[1];
        hoursWorked = Double.parseDouble(inputArray[2]);
        payRate = Double.parseDouble(inputArray[3]);
        Employee employee = new Employee(employeeId, name, hoursWorked, payRate, grossPay);
        return employee;
    }
    public static void assignToken(Employee employee){
       employeeId = employee.getEmployeeId();
        name = employee.getName();
        hoursWorked = employee.getHoursWorked();
        payRate = employee.getPayRate();
        grossPay = employee.getGrossPay();
        System.out.printf("Employee Id: %s, Name: %s, Pay Rate: $%.2f%n", employeeId, name, payRate);
        display("Gross Pay: " + grossPay);
        
    }


}

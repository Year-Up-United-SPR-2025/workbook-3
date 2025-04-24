package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;


            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\|");


                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("ID: %d | Name: %-20s | Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}

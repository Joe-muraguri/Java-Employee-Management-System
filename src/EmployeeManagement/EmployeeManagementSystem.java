package EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void viewEmployeeRecords(){
        for (Employee employee : employees){
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Position: " + employee.getPosition());
            System.out.println("Employee Salary: " + employee.getSalary());
        }
    }

}

package EmployeeManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employee records");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Employee Position");
                    String position = scanner.nextLine();
                    System.out.println("Enter Employee Salary");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(employeeId, name, position, salary);
                    ems.addEmployee(employee);
                    break;

                case 2:
                    ems.viewEmployeeRecords();
                    break;

                case 3:
                    System.out.println("Thank you for using our system.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid input. Please try again");
            }
        }
    }
}

package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Company {
    public  static void main (String[] args) {

        float sumSalary = 0;
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Please input total employee in your company:");
        int totalEmployee = scanner.nextInt();
        scanner.nextLine();
        for (int noEmployee = 0; noEmployee < totalEmployee; noEmployee++) {
            System.out.println("Please input employee name: ");
            String employeeName = scanner.nextLine();
            employee.setName(employeeName);
            System.out.println("name is: " + employee.getName());
            System.out.println("Please input employee title:");
            String employeeTitle = scanner.nextLine();
            employee.setTitle(employeeTitle);
            System.out.println("Please input employee salary: ");
            float employeeSalary = scanner.nextFloat();
            employee.setSalary(employeeSalary);
            sumSalary = sumSalary + employee.getSalary();
        }
        System.out.printf("Total salary of company is %.2f ", sumSalary);
    }

}

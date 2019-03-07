package Task6;

import Task7.Manager;

import java.util.Scanner;

public class UseEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

        int hours;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter worked hours:");
            hours = input.nextInt();
        } while (hours < 0);

        System.out.println("Tariff per hour for the Employee:" + employee1.getTariffPerHour());
        System.out.println("Salary of the Employee:" + employee1.getSalary(hours));


        Manager manager = new Manager();
        System.out.println("Tariff per hour for the Manager:" + manager.getTariffPerHour());
        System.out.println("Salary of the Manager:" + manager.getSalary(hours));

    }

}

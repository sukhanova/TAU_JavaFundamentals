package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]){
        int rate = 15;
        int maxHours = 40;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours you've worked this week:");
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double grossPay = hoursWorked * rate;
        System.out.println(String.format("Gross pay $%s for %s hours worked", grossPay, hoursWorked));
    }
}

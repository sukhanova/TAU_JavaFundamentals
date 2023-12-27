package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked:");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate:");
        double payRate = scanner.nextDouble();
        scanner.close();
        //3. Multiply hours and pay rate
        double grossPayAmt = hoursWorked * payRate;

        //4.Display result in a console
        System.out.println(String.format("Employee gross pay is $%s", grossPayAmt));
    }
}

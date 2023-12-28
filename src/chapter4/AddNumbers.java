package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter the first number");
            double firstNum = scanner.nextDouble();

            System.out.println("Enter the second number");
            double secondNum = scanner.nextDouble();

            double sum = firstNum + secondNum;
            System.out.println(String.format("The sum is %s", sum));

            System.out.println("Would you like to start over? true/false");
            again = scanner.nextBoolean();

        } while(again);
        scanner.close();
    }
}

package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]){
        int requiredIncome = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salaryInput = scanner.nextDouble();

        System.out.println("Enter years of employment: ");
        double yearsInput = scanner.nextDouble();
        scanner.close();

        if(salaryInput >= requiredIncome){
            if(yearsInput >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $"
                    + requiredIncome + " to qualify for the loan");
        }

    }
}

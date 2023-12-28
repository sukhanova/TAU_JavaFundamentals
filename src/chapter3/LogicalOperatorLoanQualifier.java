package chapter3;

import java.util.Scanner;

/*
 * LOGICAL OPERATORS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){
        int requiredIncome = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salaryInput = scanner.nextDouble();

        System.out.println("Enter years of employment: ");
        double yearsInput = scanner.nextDouble();
        scanner.close();

        if(salaryInput >= requiredIncome && yearsInput >= requiredYearsEmployed){
            System.out.println("Congrats! You qualify for the loan");
        }
        else{
            System.out.println(String.format("Sorry, you must earn at least %s to qualify for the loan",
                    requiredIncome));
        }

    }
}

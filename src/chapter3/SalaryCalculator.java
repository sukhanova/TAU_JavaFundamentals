package chapter3;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250.
*/
public class SalaryCalculator {
    public static void main(String args[]){

        int salary = 1000;
        int bonus = 250;
        int salesQuota = 10;

        System.out.println("Enter numbers of sales employee make this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
        if(sales > salesQuota){
           salary = salary + bonus;
        }
        // Output result
        System.out.println(String.format("Employee total pay is $%s", salary));
    }
}

package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String args[]){
        int quota = 10;

        System.out.println("Enter number of sales you've made this week:");
        Scanner scanner = new Scanner(System.in);

        int numberOfSales = scanner.nextInt();
        scanner.close();

        if(numberOfSales >= quota){
            System.out.println("Congratulations! You've met your quota.");
        }else {
            int salesShort = quota - numberOfSales;
            System.out.println
                    (String.format("Unfortunately you did not meet your quota. You were %s sales short",
                            salesShort));
        }
    }
}

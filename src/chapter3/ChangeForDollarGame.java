package chapter3;

import java.util.Scanner;

public class ChangeForDollarGame {
    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int penniesInput = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        int nicklesInput = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int dimesInput = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int quartersInput = scanner.nextInt();
        scanner.close();

        double totalCoins = penniesInput * penny + nicklesInput * nickel + dimesInput * dime
                + quartersInput * quarter;

        if(totalCoins < dollar){
            double amountShort = dollar - totalCoins;
            System.out.println(String.format("Sorry, you lose! You were short %.2f cents.", amountShort));
        } else if (totalCoins > dollar) {
            double amountOver = totalCoins - dollar;
            System.out.println(String.format("Sorry, you lose! You were over %.2f cents.", amountOver));
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}

package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]){
        // Get the season of the year, then whole number, then an adjective
        System.out.println("Enter the season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int numberInput = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjectiveInput = scanner.next();

        scanner.close();

        System.out.println(String.format("On a %s %s day, I drink a minimum of %s cups of coffee",
                adjectiveInput, season, numberInput));
    }
}

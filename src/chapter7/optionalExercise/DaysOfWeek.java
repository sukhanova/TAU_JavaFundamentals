package chapter7.optionalExercise;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String args[]){
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 for corresponding day of the week:");
        int userInput = scanner.nextInt();
        scanner.close();
        System.out.println(String.format("The corresponding day of the week for number %s is %s", userInput, daysOfWeek[userInput-1]));


    }
}

package chapter5;

import java.util.Scanner;

/*
* Write a method that asks a user for their name, then greet by name.
 */
public class Greetings {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String nameInput = scanner.next();

        greetUser(nameInput);
    }

    public static void greetUser(String name){
        System.out.println(String.format("Hello and welcome, %s!", name));
    }
}

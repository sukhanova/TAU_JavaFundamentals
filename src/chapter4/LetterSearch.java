package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {
    public static void main(String args[]){

        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        text.toLowerCase();
        scanner.close();

        boolean letterFound = false;
        for(int i= 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);

            if (currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}

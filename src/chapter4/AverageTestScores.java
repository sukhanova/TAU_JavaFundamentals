package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter number of tests");
        int numberOfTests = scanner.nextInt();


        for(int i = 0; i < numberOfStudents; i++){
           double total = 0;
           for(int j = 0; j < numberOfTests; j++){
               System.out.println("Enter the score for Test #" + (j+1));
               double score = scanner.nextDouble();
               total += score;
           }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" + (i+1) + " is " + average);
        }
        scanner.close();
    }
}

package chapter7;

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();
        scanner.close();
        System.out.println(String.format("Average: %.2f", calculateAverage()) );
        System.out.println(String.format("Highest grade: %s", getHighest()));
        System.out.println(String.format("Lowest grade: %s", getLowest()));
    }

    public static void getGrades(){
        for(int i = 0; i < grades.length; i++){
            System.out.println(String.format("Enter grade #%s", i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int total = 0;
        for(int grade : grades){
            total+=grade;
        }
        return total;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade: grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}

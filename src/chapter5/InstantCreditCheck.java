package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requitedSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){


        double usersSalary = getSalary();
        int usersScore = getCreditScore();
        scanner.close();
        boolean ifUserQualified = isUserQualified(usersSalary, usersScore);
        notifyUser(ifUserQualified);
    }

    public static double getSalary(){

        System.out.println("What is your salary?");
        double salaryInput = scanner.nextDouble();

        return salaryInput;
    }

    public static int getCreditScore(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your credit score?");
        int scoreInput = scanner.nextInt();

        return scoreInput;
    }

    public static boolean isUserQualified(double salary, int creditScore){
        if(salary >= requitedSalary && creditScore >= requiredCreditScore){
        return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congratulations! You've been approved for loan");
        }
        else{
            System.out.println("Sorry, you've been declined!");
        }
    }

}

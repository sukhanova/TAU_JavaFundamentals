package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);
    static double extraCharge = 0.25;
    static double taxRate = 0.15;
    public static void main(String args[]){
        System.out.println("Enter base cost of the plan:");
        double planCost = scanner.nextDouble();
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        scanner.close();
        double overageCharge = overageMinutesCost(overageMinutes);
        double tax = calculateTax(planCost + overageCharge);

        calculateAndPrintBill(planCost, overageCharge, tax);
    }

    public static double overageMinutesCost(double extraMinutes){
        double overageCost = extraMinutes * extraCharge;
        return overageCost;
    }

    public static double calculateTax(double subtotal){
        double tax = subtotal * taxRate;
        return tax;
    }

    public static void calculateAndPrintBill(double basePlanCost, double overageMin, double tax){
        double finalTotal = basePlanCost + overageMin + tax;

        System.out.println("Phone Bill Statement");
        System.out.println(String.format("Plan: $%.2f", basePlanCost));
        System.out.println(String.format("Overage: $%.2f", overageMin));
        System.out.println(String.format("Tax: $%.2f", tax));
        System.out.println(String.format("Total: $%.2f", finalTotal));
    }
}

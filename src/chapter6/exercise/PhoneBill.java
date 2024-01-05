package chapter6.exercise;

public class PhoneBill {
    private int id;
    private double basePlanCost;
    private int planMinutes;
    private int minutesUsed;


    public PhoneBill(){
        id = 0;
        basePlanCost = 79.99;
        planMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        basePlanCost = 79.99;
        planMinutes = 800;
        minutesUsed = 800;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBasePlanCost(){
        return basePlanCost;
    }

    public void setBasePlanCost(double basePlanCost){
        this.basePlanCost = basePlanCost;
    }

    public int getExtraMinutes(){
        return planMinutes;
    }

    public void setExtraMinutes(int extraMinutes){
        this.planMinutes = extraMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if(minutesUsed <= planMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = minutesUsed - planMinutes;
        return overageMinutes * overageRate;
    }


    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (basePlanCost + calculateOverage());
    }

    public double calculateTotal(){
        return basePlanCost + calculateOverage()+ calculateTax();
    }

    public void printDetailedBill(){
        System.out.println("ID: " + id);
        System.out.println(String.format("Base Rate: $%.2f", basePlanCost));
        System.out.println(String.format("Overage Fee: $%.2f", calculateOverage()));
        System.out.println(String.format("Tax: $%.2f", calculateTax()));
        System.out.println(String.format("Total: $%.2f", calculateTotal()));
    }

}

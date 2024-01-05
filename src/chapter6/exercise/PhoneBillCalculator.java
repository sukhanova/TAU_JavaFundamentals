package chapter6.exercise;

public class PhoneBillCalculator {
    public static void main(String args[]){
        PhoneBill phoneBill1 = new PhoneBill();
        PhoneBill phoneBill2 = new PhoneBill(01234);

        phoneBill1.setMinutesUsed(500);
        phoneBill1.printDetailedBill();

        phoneBill2.setMinutesUsed(830);
        phoneBill2.printDetailedBill();
    }
}

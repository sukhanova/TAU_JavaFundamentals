package chapter6;

public class MonthConverter {
    public static void main(String args[]){
        System.out.println(Month.getMonth(2));
        System.out.println(Month.getMonth("April"));
        System.out.println(Month.getMonth(100));
        System.out.println(Month.getMonth("Whatever"));
    }
}

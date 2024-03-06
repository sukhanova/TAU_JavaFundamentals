package chapter9.multipleInheritance;

public class InheritanceTester {

    public static void main(String[] args){
        Mother mom = new Mother();
        mom.setName("Svitlana");
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
}

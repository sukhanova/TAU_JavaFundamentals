package chapter10.optionalExercise;

public class Mango extends Fruit{
    public Mango(){
        setCalories(201);
    }

    public void peel(){
        System.out.println("Mango has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Mango juice is my favorite");
    }
}

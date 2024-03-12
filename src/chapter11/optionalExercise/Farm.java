package chapter11.optionalExercise;

public class Farm {

    public static void main(String[] args){
        Animal donald = new Animal() {
            @Override
            public void makeSound() {}
        };
        donald.makeSound();

        Duck daffy = new Duck();
        daffy.makeSound();

        Pig porky = new Pig();
        porky.makeSound();
    }
}

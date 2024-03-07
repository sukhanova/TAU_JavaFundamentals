package chapter10.optionalExercise;

public class Market {

    public static void main(String[] args){
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Mango mango = new Mango();
        mango.peel();

        Fruit mango2 = new Mango();
        ((Mango) mango).peel();

        Fruit grape = new Fruit();

        squeeze(apple);
        squeeze(mango);
        squeeze(mango2);
        squeeze(grape);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}

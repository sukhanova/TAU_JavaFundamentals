package chapter9.optionalExercise;

public class TasteTester {

    public static void main(String[] args){
    Cake cake = new Cake("marble");
    cake.setPrice(30.75);
    System.out.println("Cake flavor: " + cake.getFlavor());
    System.out.println("Cake price: " + cake.getPrice());

    BirthdayCake birthdayCakeWithCandles = new BirthdayCake();
    birthdayCakeWithCandles.setPrice(40.50);
    birthdayCakeWithCandles.setCandles(19);

    System.out.println(String.format("Birthday cake:\n flavor: %s,\n price: $%s,\n number of candles: %s",
            birthdayCakeWithCandles.getFlavor(),
            birthdayCakeWithCandles.getPrice(),
            birthdayCakeWithCandles.getCandles()));

    WeddingCake weddingCake = new WeddingCake();
    weddingCake.setTiers(5);
    weddingCake.setFlavor("strawberry-lemon");
    weddingCake.setPrice(100.78);

    System.out.println(String.format("Wedding cake:\n flavor: %s,\n number of tiers: %s,\n price: $%s",
            weddingCake.getFlavor(),
            weddingCake.getTiers(),
            weddingCake.getPrice()));
    }
}

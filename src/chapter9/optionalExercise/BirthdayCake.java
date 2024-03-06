package chapter9.optionalExercise;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(){
        super("red velvet");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}

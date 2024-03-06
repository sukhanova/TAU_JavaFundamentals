package chapter9.optionalExercise;

public class WeddingCake extends Cake{
    private int tiers;

    public WeddingCake(){
        super("french vanilla");
    }
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}

package chapter4;
import java.util.Random;
public class RollTheDie {
    public static void main(String args[]){
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die Game! Let's begin...");

        for(int i = 1; i <= maxRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace += die;

            System.out.print(String.format("Roll #%s: You've rolled a %s. ", i, die));

            if(currentSpace == lastSpace){
                System.out.print(String.format("You're on space %s. Congrats, you win!", currentSpace));
                break;
            } else if(currentSpace > lastSpace) {
                System.out.print(String.format("Unfortunately, that takes you past %s spaces. You lose!", lastSpace));
                break;
            }
            else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println(String.format("You're on %s space .", currentSpace));
                System.out.println(String.format("Unfortunately, you didn't make it to all %s spaces. You lose!", lastSpace));
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print(String.format("You are now on space %s and have %s more to go.", currentSpace, spacesToGo));
            }


            System.out.println();

        }
    }
}

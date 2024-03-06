package chapter9.OverrideAndOverloadMethods;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void printStatement(String what){
        System.out.println(String.format("I am a %s", what));
    }
}

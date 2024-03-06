package chapter9.OverrideAndOverloadMethods;

public class OverrideTester {

    public static void main(String[] args){

        testSquareOverride();

        System.out.println();
        Rectangle rectangle = new Rectangle();
        rectangle.printStatement();

        Square square = new Square();
        square.printStatement("square");
    }

    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        //set with different than length to test method overload
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}

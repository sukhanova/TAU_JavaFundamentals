package chapter6;

public class HomeAreaCalculator {
    public static void main(String args[]){
        // Rectangle 1
        // Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println(String.format("Area of room 1 is %s", areaOfRoom1));

        // Rectangle 2
        // Create another instance of Rectangle class
        Rectangle room2 = new Rectangle(37, 19);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println(String.format("Area of room 2 is %s", areaOfRoom2));

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println(String.format("Area of both room is %s", totalArea));
    }
}

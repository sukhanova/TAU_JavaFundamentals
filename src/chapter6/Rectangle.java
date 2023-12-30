package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
       this.length = length; // can be set this way
        setWidth(width); // or can be sat this way as alternative options
    }
    double getLength(){
        return length;
    }

    void setLength(double length){
        this.length = length;
    }

    double getWidth(){
        return width;
    }

    void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (length + width)*2;
    }

    public double calculateArea(){
        return length * width;
    }
}

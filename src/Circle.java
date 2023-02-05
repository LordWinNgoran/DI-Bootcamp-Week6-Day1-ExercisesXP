//Exercise 3: Implements The Design
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the design described by the UML Class diagram given below:
 * Date : 29/01/2023
 */
public class Circle {
    //We create attributes of the class Circle and all of them is private
    private double radius = 1.0;
    private String color = "red";

    // WE GENERATE ALL CONSTRUCTORS THEY ARE PUBLIC
    //We are the default constructor without parameters
    public Circle() { }

    //We are a constructor with one parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    //We are a constructor with two parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //A methode getRadius that return a double
    public double getRadius() {
        return this.radius;
    }
    //A methode getColor that return a String
    public String getColor() {
        return this.color;
    }


    //A method setRadius and methode setColor that have one parameter
    public void setRadius(double radius) {
        this.radius = radius;
        System.out.println("Radius " +   this.radius);
    }
    public void setColor(String color) {
        this.color =  color;
        System.out.println("Color " +   this.color);
    }

    //Method toString return a String
    public String toString() {
        return "Circle[ color:" + this.color + "radius: " + this.radius + "]";
    }


    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}

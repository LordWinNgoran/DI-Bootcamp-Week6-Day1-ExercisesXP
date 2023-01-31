//Exercise 3: Implements The Design
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the design described by the UML Class diagram given below:
 * Date : 29/01/2023
 */
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        System.out.println("Radius " +   this.radius);
    }
    public void setColor(String color) {
        this.color =  color;
        System.out.println("Color " +   this.color);
    }

    public String toString() {
        return "Circle[ color:" + this.color + "radius: " + this.radius + "]";
    }

    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}

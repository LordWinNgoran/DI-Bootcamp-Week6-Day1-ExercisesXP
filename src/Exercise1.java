//Exercise 1: Three Angles Of A Triangle

/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that asks a user to enter the three angles of a triangle.
 * If the sum of three angles entered is equal to 180, then print out “It is a valid triangle.”,
 * otherwise “It is not a valid triangle.”
 * Date : 29/01/2023
 */

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        // create a constructor to initiate
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the angle 1, angle 2 and angle 3:");
        // we create 3 vars to store each angle
        int angle1 = myObj.nextInt();
        int angle2 = myObj.nextInt();
        int angle3 = myObj.nextInt();
        int sumAngle = 0;
        //The sumAngle is the sum of the 3 var
        sumAngle = angle1 + angle2 +angle3 ;
        if ( sumAngle == 180 ){
            System.out.println("It is a valid triangle.");
        }else {
            System.out.println("It is not a valid triangle.");
        }
    }
}

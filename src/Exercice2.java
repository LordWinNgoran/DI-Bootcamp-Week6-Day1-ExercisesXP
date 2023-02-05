//Exercise 2: Time Difference

import java.util.Scanner;

/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: you’ll need to ask the user about the time difference between their home and where they are going.
 * Date : 29/01/2023
 */
public class Exercice2 {
    public static void main(String[] args) {
        //We create all vars that are used
        int TimeDifference, DestinationNight, DestinationJourney;
        System.out.println("the time difference between your home and where you are going");
        // store the time difference in var TimeDifference
        Scanner scanner = new Scanner(System.in);
        TimeDifference = scanner.nextInt();

        //The ternary Condination use to determine if difference is under 0 or over
        DestinationNight = TimeDifference < 0 ? 24 + TimeDifference : TimeDifference;
        DestinationJourney = 12 + TimeDifference;

        System.out.println("It will be" + DestinationJourney + "H to your destionation when your home is  12h" +
                "and it will be " + DestinationNight + "H to your destionation when your home is  00h");
    }
}
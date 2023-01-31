//Exercise 2: Time Difference

import java.util.Scanner;

/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: you’ll need to ask the user about the time difference between their home and where they are going.
 * Date : 29/01/2023
 */
public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer le décallage horaire entre votre domicile et votre destination." +
                "\n(Entrez une valeur négative si la destination est en retard sur le domicile)");

        Scanner scanner = new Scanner(System.in);
        int decallageHorraire = scanner.nextInt();

        int heureDestinationNuit = decallageHorraire < 0 ? 24 + decallageHorraire : decallageHorraire;
        int heureDestinationJournee = 12 + decallageHorraire;

        System.out.println("Il sera " + heureDestinationJournee + "H à la destination lorsqu'il sera 12h au domicile " +
                "et il sera " + heureDestinationNuit + "H à la destination lorsqu'il sera 00H au domicile");
    }
}
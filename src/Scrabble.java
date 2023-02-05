//Exercise 4: Compute The Scrabble
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the design described by the UML Class diagram given below:
 * Date : 29/01/2023
 */
import java.util.Scanner;

public class Scrabble {
    static char [] onePoints = {'A','E','I', 'O','U', 'L', 'N', 'R','S','T'};
    static char [] twoPoints = {'D','G','I','O','U','L','N','R','S','T'};
    static char [] threePoints = {'B','C','M','P'};
    static char [] fourPoints = { 'F','H', 'V','W','Y'};
    int K = 5;
    static char [] eightPoints = {'J', 'X'};
    static char [] tenPoints = {'Q', 'Z'};
    public static void main(String[] args) {
        // We create all vars and initiate a class of scanner
        String result, userWord;
        char[] charsUserWord;
        Scanner myObj = new Scanner(System.in);
        //a user to enter a word
        System.out.println("Please enter your word : ");
        //Change the sensitive to uppercase
        userWord = myObj.nextLine().toUpperCase();
        //Convert a word to array of char
        charsUserWord = userWord.toCharArray();
        //we pass the new array of char to method getScore
        result = getScore(charsUserWord);
        // Output the result
        System.out.println(result);
    }


    // The getScore methode
    public static String getScore(char[] charsUserWord){
        int score = 0;
        //For each element of array char we pass them to inArray methode to check if it is in and return a number
        for (int i = 0; i < charsUserWord.length; i++) {
            score = score+ inArray(charsUserWord[i],onePoints) + inArray(charsUserWord[i],twoPoints) +
                    inArray(charsUserWord[i],threePoints) +  inArray(charsUserWord[i],fourPoints) +
                    inArray(charsUserWord[i],eightPoints) +  inArray(charsUserWord[i],tenPoints) ;
        }

        return "You score is :" + score;
    }

    public static int inArray(char chars, char[] arrayChar){
        int valueScore=0;
        //in this loop we navigate in all char of points to see the result
        for(int j = 0;j < arrayChar.length; j++){
            if(arrayChar==onePoints){
                if(chars == arrayChar[j]){
                    valueScore = valueScore +1;
                }
            } else if (arrayChar==twoPoints) {
                if(chars == arrayChar[j]){
                    valueScore = valueScore +2;
                }
            } else if (arrayChar==threePoints) {
                if(chars == arrayChar[j]){
                    valueScore = valueScore +3;
                }
            }else if (arrayChar==fourPoints) {
                if(chars == arrayChar[j]){
                    valueScore = valueScore +4;
                }
            }
            else if (arrayChar==eightPoints) {
                if(chars == arrayChar[j]){
                    valueScore = valueScore +8;
                }
            }
            else if (arrayChar==tenPoints) {
                if(chars == arrayChar[j]){
                    valueScore = valueScore +10;
                }
            }else if (chars=='K') {
                    valueScore = valueScore +5;

            }else {
                valueScore=valueScore+0;
            }

        }
        return valueScore;
    }


}

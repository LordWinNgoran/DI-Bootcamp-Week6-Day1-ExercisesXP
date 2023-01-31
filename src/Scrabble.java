//Exercise 4: Compute The Scrabble
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a Java program that implements the design described by the UML Class diagram given below:
 * Date : 29/01/2023
 */
import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String result;
        System.out.println("Please enter your word : ");
        String userWord = myObj.nextLine().toUpperCase();
        char[] charsUserWord = userWord.toCharArray();
        result = getScore(charsUserWord);
        System.out.println(result);
    }
    static char [] onePoints = {'A','E','I', 'O','U', 'L', 'N', 'R','S','T'};
    static char [] twoPoints = {'D','G','I','O','U','L','N','R','S','T'};
    static char [] threePoints = {'B','C','M','P'};
    static char [] fourPoints = { 'F','H', 'V','W','Y'};
    int K = 5;
    static char [] eightPoints = {'J', 'X'};
    static char [] tenPoints = {'Q', 'Z'};

    public static String getScore(char[] charsUserWord){
        int score = 0;
        for (int i = 0; i < charsUserWord.length; i++) {
            score = score+ inArray(charsUserWord[i],onePoints) + inArray(charsUserWord[i],twoPoints) +
                    inArray(charsUserWord[i],threePoints) +  inArray(charsUserWord[i],fourPoints) +
                    inArray(charsUserWord[i],eightPoints) +  inArray(charsUserWord[i],tenPoints) ;
        }

        return "You score is :" + score;
    }

    public static int inArray(char chars, char[] arrayChar){
        int valueScore=0;
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

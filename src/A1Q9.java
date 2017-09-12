
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        
        // set the number of words
        int n = 10;
        
        // all variables
        String[] words = new String[n];
        int[] countLetters = new int[n];
        int totalLetters = 0;
        
        // ask for amount of words
        System.out.println("Enter " + n + " words (please press enter after each word): ");

        // put the entered words into the array
        for (int i = 0; i < words.length; i++) {
            words[i] = input.nextLine();
        }
        
        // count the letters in every entered word
        for (int i = 0; i < words.length; i++) {
            countLetters[i] = words[i].length();
        }
        
        // calculate the total number of letters
        for (int i = 0; i < countLetters.length; i++) {
            totalLetters += countLetters[i];
        }
        
        // calculate the average letters per word
        int average = totalLetters / n;
        
        // output all calculated data
        System.out.println("----------------");
        System.out.println("Total amount of characters: " + totalLetters);
        System.out.println("Average characters per word: " + average); 
        
    }
}

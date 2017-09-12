
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // variable for counting words
        int i = 0;

        System.out.println("Enter a word (\"exit\" to exit): ");
        
        // ask for input word, if the word is not "exit" it adds 1 to the word count and repeats the cicle, otherwise it breaks the loop
        while (true) {
            String word = input.next();

            if (!word.equals("exit")) 
                i++;
            else 
                break;
            

        }

        // output the amount of words that were entered
        System.out.println("--------------");
        System.out.println("You entered " + i + " words.");
    }
}

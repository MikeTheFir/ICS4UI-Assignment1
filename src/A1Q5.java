
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        
        // number variable
        int number = 0;

        // ask for number between 1 and 10 only
        while (!(number > 0 && number <= 10)) {
            System.out.print("Please enter a number between 1 and 10: ");
            number = input.nextInt();
        }

        // output asterixs
        for (int i = 0; i < number; i++) {
            System.out.println("");
            
            for (int x = 0; x < number; x++) {
                System.out.print(" *");
            }
        }
        
        
        
    }
}

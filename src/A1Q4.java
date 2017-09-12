
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // number variable
        int number = 0;

        //while the number is outside parameters ask for a number
        while (!(number > 0 && number <= 10)) {
            System.out.println("Please enter a number between 1 and 10: ");
            number = input.nextInt();
        }
        
        // put out the asterixs
        for (int i = 0; i < number; i++) {
            System.out.println("* "); 
        }  
    }
}

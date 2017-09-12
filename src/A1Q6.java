
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        
        // integers
        int number = 0;
        int x = 100;
        
        // ask for number thats bigger than 50 and smaller than 100
        while(number < 50 || number > 100){
            System.out.println("Please enter a number between 50 and 100 to stop at: ");
            number = input.nextInt();
        }
        
        // countdown if it is less than x
        while(number < x){
            System.out.println(x);
            x -= 5;
        }
    }
}

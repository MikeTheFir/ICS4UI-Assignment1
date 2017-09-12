
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make an array to store numbers
        int[] num = new int[3];
        // new scanner
        Scanner input = new Scanner(System.in);
        // get three numbers
        System.out.println("Please input three numbers:");
        for(int i = 0; i < num.length; i++){
             // store numbers in array
        num[i] = input.nextInt();
        }
        // output the product of the numbers
        int product = num[0]*num[1]*num[2];
            System.out.println("The product of these numbers are " + product);
        // output the square of the numbers
        float square = (int) Math.pow(product,2);
            System.out.println("The product squared is " + square);
        // output the square root of the numbers                }
        double root = Math.sqrt(product);
            System.out.println("The squareroot of the product is " + root);
        
    }
}

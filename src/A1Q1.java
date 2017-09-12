
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);
        // ask user to input name
        System.out.println("Tell me your name please:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}

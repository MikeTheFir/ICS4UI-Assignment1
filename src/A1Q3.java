
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);
        
        // make array to store all expenses
        double[] allExpenses = new double[6];
        double total = 0;
        int tickets;
        
        // expenses for food
        System.out.println("Cost of food: ");
        allExpenses[0] = input.nextDouble();
        // expenses for DJ
        System.out.println("Cost of DJ: ");
        allExpenses[1] = input.nextDouble();
        // expenses for the hall rental
        System.out.println("Cost of hall rental: ");
        allExpenses[2] = input.nextDouble();
        // expenses for decorations
        System.out.println("Cost of decorations: ");
        allExpenses[3] = input.nextDouble();
        // expenses for the wait staff
        System.out.println("Cost of wait staff: ");
        allExpenses[4] = input.nextDouble();
        // expenses for miscellaneous things
        System.out.println("Cost of miscellaneous things: ");
        allExpenses[5] = input.nextDouble();
        // total money spent
        for (int i = 0; i < allExpenses.length; i++) {
            total += allExpenses[i];
        }
        // amount of tickets needed to break even (tickets cost $35)
        tickets = (int) total / 35;

        // output total
        System.out.println("The total is: " + total);

        //output number of tickets needed to be sold
        System.out.println("You need to sell " + (tickets + 1) + " tickets to break even");
    }
}

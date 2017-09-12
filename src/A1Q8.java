
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // all variables
        float i = 0.00f, r = 0.00f, bal = 0.00f;
        int yrDbl, yrMil;
        int crntYr = 2017;
        yrDbl = crntYr;
        yrMil = crntYr;

        // ask for initial amount
        System.out.print("Enter the initial amount: ");
        i = input.nextFloat();

        // ask for interest rate
        System.out.print("Enter the interest rate (in %): ");
        r = input.nextFloat();

        // set the balance to i
        bal = i;

        // separate the input from the output
        System.out.println("-------------------------");

        // calculate on what year the balance will double
        while (bal < (i * 2)) {
            bal = (1 + (r / 100)) * bal;
            yrDbl++;
        }

        // output the year when it is doubled
        System.out.println("Year when you double your balance: " + yrDbl + " at " + bal + "$");
        // set the balance back to the initial amount
        bal = i;

        // calculate in what year the balance will hit a mil.
        while (bal < 1000000) {
            bal = (1 + (r / 100)) * bal;
            yrMil++;
        }

        // output the year when balance hits a million as long as the initial balance is not a mil
        if (i < 1000000) 
            System.out.println("Year when your balance is at 1 million: " + yrMil + " at " + bal + "$");
        else 
            System.out.println("Your balance is already at 1 million");
        
        
    }
}

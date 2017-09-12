/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //all variables
        double pop = 6.00;
        double popGoal = 10.00;
        int yr = 1999;
        
        System.out.println("Year : Population");
        System.out.println("-----------------");

        // while population is under 10 billion
        while(pop < popGoal){
            
            // output year and population
            System.out.println(yr + " : " + pop);
            
            // add to year every cycle
            yr++;
            // multiple population by annually
            pop *= 1.014;
        }
        
        // output when pop reaches 10 billion
        System.out.println("----------------");
        System.out.println("The population exceeded 10 billion after " + (yr - 1999) + " years");
    }
}

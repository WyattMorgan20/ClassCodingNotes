/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericdata;

/**
 *
 * @author s540549
 */
import java.util.Scanner;

public class NumericData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int population;
        int birth;
        int death;
        int immigrant;
        int totalpop;
        int years;
        int totalDiff;
        
        population = 312032486;
        birth = 4505142; //Number of births in one year
        death = 2425846; //number of deaths in one year
        immigrant = 700800; //number of immigrants in one year
        totalDiff = 2780096;
        
        /*Pt 1
        totalpop = (population + birth - death + immigrant);
        System.out.println("The population after 1 year is " + totalpop);
        totalpop = (totalpop + birth - death + immigrant);
        System.out.println("The population after 2 years is " + totalpop);*/
        

        //pt 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        totalpop = (population + (totalDiff * years));
        System.out.println("The pupulating in " + years + " years is " + totalpop);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monetaryunits;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class MonetaryUnits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = input.nextInt();
        
        int dollar = amount/100;
        int cent = amount%100;
        
        System.out.println(dollar+" dollars and "+cent+" cents");
        
    }
    
}

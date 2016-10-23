/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingenergy;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class CalculatingEnergy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double initialTemperature = input.nextDouble();
        System.out.println(" Enter the final temperature:");
        double finalTemperature = input.nextDouble();
        
        double energy = kilograms * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println("The energy needed is"+energy);
        
    }
    
}

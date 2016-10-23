/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeareawithconsoleinput;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class ComputeAreaWithConsoleInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number For Radius:");
        double Radius = input.nextDouble();
        
        double area = Radius * Radius * 3.14159;
        System.out.println("The area is circle radius " + Radius + " is "+area);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialapplicationcalculatingtips;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class FinancialApplicationCalculatingTips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = gratuityRate / 100*subtotal;
        
       double total = subtotal + gratuity;
       
        System.out.println(" The Gratuity is $ " + gratuity + "and Total is $ "+ total + "\n");
    }
    
}

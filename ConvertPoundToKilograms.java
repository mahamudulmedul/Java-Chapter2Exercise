/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertpoundtokilograms;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class ConvertPoundToKilograms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number in Pounds: ");
        
        double pounds = input.nextDouble();
        
        double kilograms = pounds * 0.454;
        
        System.out.println(pounds + " Pounds is " + kilograms + " Kilograms ");
    }
    
}

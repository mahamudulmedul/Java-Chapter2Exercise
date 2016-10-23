/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeaverage;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class ComputeAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Number:");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double average = (number1+number2+number3)/3;
        
        System.out.println("The Average of" + number1 + " " + number2+ " " + number3 + " is " + average);
    }
    
}

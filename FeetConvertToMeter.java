/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feetconverttometer;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class FeetConvertToMeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for Feet: ");
        double feet = input.nextDouble();
        double meters  = feet*0.305;
        System.out.println(feet + " feet is " + meters + " meters ");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingnumberofyears;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Medul
 */
public class FindingNumberOfYears {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers Of Minutes:");
        int minutes = input.nextInt();
        int days  = 1, year = 0; 
        
        year = minutes /(365*24*60);
        int x = minutes - (year*365*24*60);
        days = x/(24*60);
        System.out.println(minutes + " minutes is approximately " + year + " years and "+ days + " days ");
    }
    
}

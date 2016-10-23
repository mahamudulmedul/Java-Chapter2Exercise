/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundvalue;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class CompoundValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Balance:");
        double balance = input.nextDouble();
        System.out.println("enter interest rate:");
        double anualInterestRate = input.nextDouble();
        double monthlyInterestRate = (anualInterestRate/100)/12;
        double total = balance * (1 + monthlyInterestRate);
        total = (balance + total) * (1 + monthlyInterestRate);
        total = (balance + total) * (1 + monthlyInterestRate);
        total = (balance + total) * (1 + monthlyInterestRate);
        total = (balance + total) * (1 + monthlyInterestRate);
        total = (balance + total) * (1 + monthlyInterestRate);

        System.out.println("After six Month the total is : " + total);

    }

}

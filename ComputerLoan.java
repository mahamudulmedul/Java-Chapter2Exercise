/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerloan;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class ComputerLoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Monthly Interest Rate, 8.25 : ");
        double annualInterestrate = input.nextDouble();
        
        double monthlyInterestrate = annualInterestrate /1200;
        
        System.out.println("Enter yearly interest rate , as int 5 years : ");
        
        int numbersofYears = input.nextInt();
        
        System.out.println("Ener Loan amount for ex 120000.95: ");
        
        double loanAmount = input.nextDouble();
        double monthlyPayment = loanAmount * monthlyInterestrate / (1- 1 / Math.pow(1 + monthlyInterestrate, numbersofYears * 12));
        double totalPayment = monthlyPayment * numbersofYears * 12;
        
        System.out.println("The monthly payment is " +(int)(monthlyPayment * 100) / 100.0);
       System.out.println("The total payment is " +(int)(totalPayment * 100) / 100.0);
    }
    
}

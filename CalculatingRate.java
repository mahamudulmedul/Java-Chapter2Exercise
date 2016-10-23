/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingrate;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class CalculatingRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate: ");
        int balance = input.nextInt();
        double annualInterestRate = input.nextDouble();

        double interest = (balance * annualInterestRate) / 1200;

        System.out.println("The interest is  " + interest);

    }

}

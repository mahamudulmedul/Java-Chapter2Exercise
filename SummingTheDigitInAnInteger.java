/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summingthedigitinaninteger;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class SummingTheDigitInAnInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        
        int num = input.nextInt();
        
        int lessThan10 = num % 10;
        int ten = (num/10)%10;
        int hundres = (num/100)%10;
        
        int answer = lessThan10 + ten + hundres;
        
        System.out.println("The sum of Digits is :"+answer);
    }
    
}

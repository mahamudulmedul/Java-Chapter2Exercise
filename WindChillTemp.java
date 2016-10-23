/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windchilltemp;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class WindChillTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double ta = input.nextDouble();
        System.out.println("Enter the wind speed miles per hour:");
       double v = input.nextDouble();
    
        double windChill = (35.74 + 0.6215*ta)-(35.75*Math.pow(v,0.16))+(0.4275*ta*Math.pow(v, 0.16));
        
        System.out.println("The wind chill index is "+ windChill);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaytime;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class DisplayTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer for seconds: ");
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        int remaningseconds=seconds%60;
        System.out.println(seconds + " seconds is " + minutes + " Minutes is " + remaningseconds + " seconds ");
        
    }
    
}

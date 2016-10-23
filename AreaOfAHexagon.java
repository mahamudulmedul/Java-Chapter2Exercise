/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.a.hexagon;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class AreaOfAHexagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side:");
        double side = input.nextDouble();
        double area = 3*1.732*side*side/2;
        System.out.println("The area of the hexagon is"+area);
                
    }
    
}

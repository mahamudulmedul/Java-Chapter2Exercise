/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computearea;

/**
 *
 * @author Medul
 */
public class ComputeArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius;
        double area;
        
        radius = 20;
        
        area = radius * radius * 3.14159;
        System.out.println("The area is circle radius " + radius + " is "+area);
    }
    
}

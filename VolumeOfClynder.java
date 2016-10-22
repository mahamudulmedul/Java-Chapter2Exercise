/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumeOfClynder;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class VolumeOfClynder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        double volume = area * length;

        System.out.println("The Area Is "+area +"\n" +"The Volume is " + volume);
        

        

    }

}

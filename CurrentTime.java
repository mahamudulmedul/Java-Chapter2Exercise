/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currenttime;

import java.util.Scanner;

/**
 *
 * @author Medul
 */
public class CurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        int offset = input.nextInt();
        long totalMilliSeconds = System.currentTimeMillis();
        
        
        long totalSeconds = totalMilliSeconds/1000;
        
        long currentSeconds = (int)(totalSeconds%60);
        
        long totalMinutes = totalSeconds/60;
        
        long curentMinutes = totalMinutes % 60;
        
        long totalHours = totalMinutes %60;
        
        long currentHours = totalHours % 24;
        currentHours = currentHours+offset;
        
        System.out.println("Cuurent Time is "+ currentHours+":"+curentMinutes+":"+currentSeconds+ " GMT ");
    }
    
}

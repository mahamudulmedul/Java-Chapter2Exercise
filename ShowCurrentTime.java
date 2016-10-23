/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showcurrenttime;

/**
 *
 * @author Medul
 */
public class ShowCurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long totalMilliSeconds = System.currentTimeMillis();
        
        
        long totalSeconds = totalMilliSeconds/1000;
        
        long currentSeconds = (totalSeconds%60);
        
        long totalMinutes = totalSeconds/60;
        
        long curentMinutes = totalMinutes % 60;
        
        long totalHours = totalMinutes /60;
        
        long currentHours = totalHours % 24;
        
        System.out.println("Cuurent Time is "+ currentHours+":"+curentMinutes+":"+currentSeconds+ " GMT ");
        
    }
    
}

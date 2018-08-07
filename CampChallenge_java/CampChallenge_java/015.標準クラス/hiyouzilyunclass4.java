
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class hiyouzilyunclass4 {
    public static void main(String[] args) {
    
    Date c = new Date(115,0,1,0,0,0);
    //c.set(2015,0,1,0,0,0);
    
    Date k = new Date(115,11,31,23,59,59);
   // k.set(2015,11,31,23,59,59); 
   
   int i=(int) (k.getTime()-c.getTime());
    //k.add(Calendar.YEAR, -c.YEAR); 	
    //k.add(Calendar.MONTH, -c.MONTH); 	
    //k.add(Calendar.DAY_OF_MONTH, -c.DAY_OF_MONTH);
    //k.add(Calendar.HOUR_OF_DAY, -c.HOUR_OF_DAY); 
   
    //k.add(Calendar.MINUTE, -c.MINUTE); 
    //k.add(Calendar.SECOND, -c.SECOND);  
    System.out.print(k.getTime());
     
    }
}


import java.text.SimpleDateFormat;
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
public class hilyouzilyunclass3 {
    
    public static void main(String[] args) {
    Date d = new Date(116,11,04,10,0,0);
    
    SimpleDateFormat a =
            new SimpleDateFormat("yyyy年/MM月/dd日 HH時:mm分:ss秒");
     
    System.out.println(d.getTime());
    System.out.print(a.format(d));
    
    }
}

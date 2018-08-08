
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.LINE_SEPARATOR;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.Box.Filler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class class7 {
    public static void main(String args[]) throws IOException{
    Vector v=new Vector();
   
		
        String obj1=new String("台風接近の為");
	String obj2=new String("30分早く帰ります");
		
	v.addElement(obj1);
	v.addElement(obj2);
        System.out.println(v);
        
        
        Date s =new Date();
        Date d =new Date(130, 8, 8, 14, 34, 33);
        SimpleDateFormat p =
            new SimpleDateFormat("yyyy年/MM月/dd日 HH時:mm分:ss秒");
        File fp = new File("test.txt");

       
        FileWriter fw = new FileWriter(fp);
        
        fw.write("Vectorクラスによるオブジェクトの可変長配列を実装します。");
        fw.write(p.format(s)+"時開始");
        fw.write(p.format(d)+"時終了");

        fw.close();         
        
        FileReader fr = new FileReader(fp);

        BufferedReader br = new BufferedReader(fr);
   
        System.out.print(br.readLine());

        br.close();
                
    }
}


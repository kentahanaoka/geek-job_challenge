
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
class pr2 {
    public static void main(String[]args) throws IOException{
    
         File pr = new File("test.txt");
     
         FileWriter fw = new FileWriter(pr);
         fw.write("花岡健太です！");
         fw.write("埼玉県所沢市に住んでいます！");
         fw.write("お寿司が好きです！");
         //System.out.print(pr.readLine(3));
         fw.close();
        
         FileReader fr = new FileReader(pr);
         BufferedReader br = new BufferedReader(fr);
         System.out.print(br.readLine());
         br.close();
    }
}

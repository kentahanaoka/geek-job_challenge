/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author guest1Day
 */
public class user extends Human{
 
 
     public int open(){
     int sum=0;
     for(int i = 0; i<this.myCard.size();i++){
         sum+=this.myCard.get(i);
     }return sum;
     }
     
     public void setcard(ArrayList<Integer> n){
                for(int i =0;  i < n.size(); i++)
                       this.myCard.add(n.get(i));
            }
 
 

     
     
     
    public boolean checkSum(){
  
        if(open()<16){
        return true;
        } 
        else { return false;
        }

    

 }

    @Override
    public void setCard(ArrayList<Integer> n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

}

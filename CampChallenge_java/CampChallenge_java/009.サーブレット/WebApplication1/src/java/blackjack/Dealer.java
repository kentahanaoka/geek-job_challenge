/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import static java.awt.AWTEventMulticaster.add;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author guest1Day
 */
 public  class Dealer extends Human{

    ArrayList<Integer> cards= new ArrayList<Integer>();

    Dealer(){
        
        for(int i= 1;i<=4;i++){
            for(int j= 1;j<=13;j++){
                if(j>10){
                    cards.add(10);
                } else {
                    cards.add(j);  
                }    
                 
                
               
            }
        }
    }
    

    
 
public ArrayList<Integer> deal(){
ArrayList<Integer> a = new ArrayList<Integer>();

Collections.shuffle(this.cards);
a.add(this.cards.get(0));
this.cards.remove(0);
a.add(this.cards.get(1));
this.cards.remove(1);

//myCard=a;
//int total=
return a;
}

public ArrayList<Integer> hit(){
ArrayList<Integer> b = new ArrayList<Integer>();
Collections.shuffle(this.cards);
b.add(this.cards.get(0));
this.cards.remove(0);
return b;
}


  public void setcard(ArrayList<Integer> n){
                for(int i =0 ;  i < n.size(); i++)
                       this.myCard.add(n.get(i));
            }
 



    public boolean checkSum(){
          
        if(open()<16){
        return true;
        } 
        else { return false;
        }
        
    }
    
    
    
    public int open(){
     int sum=0;
     for(int i = 0; i<this.myCard.size();i++){
         sum+=this.myCard.get(i);
     }return sum;
     }

    @Override
    public void setCard(ArrayList<Integer> n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

  

    

   
     
    };
    

    
    
    
   
   
    

  

 
  

    
 
 
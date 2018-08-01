package blackjack;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author guest1Day
 */



abstract class Human{
abstract public int open();
//ArrayList<Integer> num = new ArrayList<Integer>();
abstract public void setCard( ArrayList<Integer>n);
abstract public boolean checkSum();
ArrayList<Integer> myCard = new ArrayList<Integer>(){};
}



   

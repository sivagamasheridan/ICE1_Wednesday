/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogheneruona_Omamohwo_ICE1;

/**
 *
 * @author srinivsi
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getter/setters
 */
import java.util.Random;
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"Diamonds","Clubs","Spades","Hearts"};
Random R=new Random();
    
    

    
    public void setSuits(String suits) {
         
        int randomNumber= (int) (SUITS.length * Math.random());   
        this.SUITS[randomNumber] = SUITS[randomNumber];
         suits=SUITS[randomNumber];
         this.suits=suits;
    }
    public String getSuits() 
    {
        
        return suits;
    }

    
    public int getValue() {
        return value;
    }

    
    public void setValue(int value) {
        
        
      value= (int)(1+ (12.0 * Math.random()));
      this.value = value;
        
       
    }
public void randomValue()
{
           // return value;
}
}

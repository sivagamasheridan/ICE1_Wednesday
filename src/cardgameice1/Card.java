/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 * @author yetmanj999
 * Student id: 991354488
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"Diamonds","Clubs","Spades","Hearts"};
    
    public String getSuits() {
        return this.suits;
    }

    
    public void setSuits(String suits) {
        this.suits = suits;
    }

    
    public int getValue() {
        return value;
    }

    
    public void setValue(int value) {
        this.value = value;
    }
    
    //Two random generators created for the suits and values.
     public static String randomSuit() {
           String suits = (Card.SUITS[(int)Math.floor(4 * Math.random())]);
           return suits;
       }
     
     public static int randomValue() {
           int value = (int)(Math.floor(Math.random() * 13 + 1));
           return value;
       }
     
     
    
     
}
//public int randomValue()
//{
    //int value= // 
           // return value;
//}


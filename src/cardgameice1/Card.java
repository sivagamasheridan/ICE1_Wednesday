/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Random;

/**
 *
 * @author srinivsi
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
    
    public String getSuits() {
        return suits;
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
public int randomValue()
{
    Random rand = new Random();
    int value=  rand.nextInt(13)+1;
            return value;
}

public String randomSuit()
{
    Random rand = new Random();
    int value = rand.nextInt(4);
    String suit = SUITS[value];
    return suit;
}
}

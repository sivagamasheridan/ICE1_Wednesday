/*
 * Student ID: 991585936
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author Ratidner Singh Bhullar
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 betters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};

    public Card() {}
    
    public Card(int value, String suit){
        this.value = value;
        this.suits = suits;
    }
    
    public int getValue() {
        return value;
    }
    /**
     * 
     * @param value 
     */
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getSuits(){
        return this.suits;
    }
    /**
     * 
     * @param suits
     */
    public void setSuits(String suits){
        this.suits = suits;
    }
    public int randomValue() {
     return (int)(Math.ceil(Math.random()*13));     
    }
    
    public String randomSuit(){
        return SUITS[(int)(Math.round(Math.random()*3))];
    }
}

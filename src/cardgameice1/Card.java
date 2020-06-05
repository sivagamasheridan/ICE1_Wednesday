package cardgameice1;

import java.util.Random;

/**
 *
 * @author saltatj
 * @date 2020-06-04
 
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
    
    //Randomly Generates a magic card 
    public Card createMagicCard(){
        this.setValue(randomCardValue());
        this.setSuits(randomSuit());
        
        return this;
    }
    
    //randomly picks a value from 1-13
    public int randomCardValue(){
         Random r = new Random();
            int min = 1;
            int max = 13;
         
            value = r.nextInt(max-min) + min;
           
           return value;
    }
    //Randomly picks a suit from SUIT array
    public String randomSuit(){
        Random r = new Random();
            int min = 0;
            int max = 3;
         
            int index = r.nextInt(max-min) + min;
            String suit = SUITS[index];
        return suit;
    }
    

}


/*
 * Kirat Mehta
 * ICE1 Assignment
 * Student Id- 991587670
 */
package cardgameice1;

/**
 *
 * @author KiratMehta
 
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
    
     
       
}

/*
 * Modifier: Gurjit Singh
 * Student ID: 991592634
 */
package assignment;

/**
 *
 * @author Gurjit
 */
public class Card {
 
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
    

    
    public int getValue() {
        return value;
    }
    
    
    public Card(){
        
    }
    
    public Card(int value, String suit){
        this.value = value;
        this.suits = suits;
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
    public String SUIT(int num)
    {
        if(num==0)
            return "Hearts";
        else if(num==1)
            return "Clubs";
        else if(num==2)
            return "Spades";
        else
            return "Diamonds";
    }
}
   


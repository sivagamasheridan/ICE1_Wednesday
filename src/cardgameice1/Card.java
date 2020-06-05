

/**
 *
 * @author Kunal Sharma
 
 */
import java.util.Random;
public class Card 
{
  private String suit;//diamonds,clubs,spades, hearts
  private String value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
public static final String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};   
     Random r= new Random();
    int randomValue=r.nextInt(SUITS.length);
    int randomValue2 = r.nextInt(values.length);
    

public String getSuits() {
    suit = SUITS[randomValue];   
    return suit;
    }

    
    public void setSuits(String suit) {
        suit = SUITS[randomValue];
        this.suit = suit;
        
    }
    
    public String getValue() {
       value = values[randomValue2];  
        return value;
    }
  
    public void setValue(String value) {
     value = values[randomValue2];  
        this.value = value;
    }
  
    public @Override String toString()
    {
        return this.value + " of " + this.suit;
    }
      
    
}

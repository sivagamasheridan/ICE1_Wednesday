

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
public static final String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};  // works better as String than int
     Random r= new Random();
    int randomValue=r.nextInt(SUITS.length); // creates 2 different variables I can use to run through the arrays as an index value
    int randomValue2 = r.nextInt(values.length);
    

public String getSuits() {
    suit = SUITS[randomValue];   // tried Math.random()*4 earlier but it didn't work so I had to import java util Random
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

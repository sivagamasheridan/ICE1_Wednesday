

/**
 *
 * @author Kunal Sharma 213065933
 */
import java.util.Random;
import java.util.Scanner;
public class CardGameICE1
{
  
    public static void main(String[] args)
    {        
        Scanner in = new Scanner(System.in);
        int count = 0; // used to keep score
        
        Card[] magicHand = new Card[7];
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue("");
           c.setSuits("");        
           
           magicHand[i]=c;//saving object in array                              
        System.out.println("Enter a card suit followed by 'of' and then its corresponding rank!"); //Instructions for user.
       String guessHand= in.nextLine();
        if (guessHand.equals(c.toString())) { // converts Object to string, necessary for comparison
          System.out.println("You guessed correctly!");
          count++; // updates score
        }else {
             System.out.println("Incorrect! The card was actually " + c); //reveals card.
        }
        }
         
         System.out.println("You guessed " + count + " cards correctly!"); // displays score at the end of loop
    
    }
    
}

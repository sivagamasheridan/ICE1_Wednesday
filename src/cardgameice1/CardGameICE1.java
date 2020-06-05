package cardgameice1;

/**
 *
 * author saltatj
 * date 2020-06-04
 * Student ID: 991443396
 */
import java.util.Scanner;

public class CardGameICE1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 

        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {         
           Card c = new Card();//object
           c.createMagicCard(); 
           System.out.println(c.getSuits()+ c.getValue());
           magicHand[i]=c;//saving object in array
     }
        
       
    Scanner input = new Scanner(System.in);
    //asks user to input Suit and Value Number  
  
    System.out.println("Pick a value(1-13):");
    int value = input.nextInt();
  
    System.out.println("Pick a suit(diamonds,clubs,spades,hearts):");
    input.nextLine();
    String suit = input.nextLine();
    
    //if player chooses rigth card, break out of loop
    if (checkCard(magicHand, value, suit)){
        System.out.println("You picked a magic card!");
    }
    else
         System.out.println("Sorry, You didnt picked a magic card!");
    }
    
  
     //Check user's card to see if its a Magic Card
    public static boolean checkCard(Card[] magicHand ,int value, String suit)
    {
   for (int i=0;i<magicHand.length;i++){
       if (value == magicHand[i].getValue() && suit.equalsIgnoreCase(magicHand[i].getSuits()))
        {
         return true;
        }
       }
   return false;
     
 }
}

    

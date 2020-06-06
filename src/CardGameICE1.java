/*991592036
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Scanner;
/**
 *
 * @author Harleen Kaur
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue(c.randomValue());
           c.setSuits(c.randomSuit());
           magicHand[i]=c;//saving object in array
           System.out.println(c.getSuits());
            System.out.println(c.getValue());
        }
        
        //take input from user 
        System.out.println("Pick a suit(diamonds, spades, hearts, clubs): ");
        String suit = input.nextLine();
   
        System.out.println("Choose value of card(1-13): ");
        int value = input.nextInt();
            
        boolean cardMatch = false;
        
        for (int i = 0; i<magicHand.length; i++) {
            if (value == magicHand[i].getValue() &&
                    suit.equalsIgnoreCase(magicHand[i].getSuits())) {
                cardMatch = true;
                System.out.println("The card matched with the computer");
                break;
            }
        }
if (cardMatch == false){
            System.out.println("It did not match.Better luck next time!!");
        }
    }
}
    


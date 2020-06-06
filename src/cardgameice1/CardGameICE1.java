/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
import java.util.Scanner;

public class CardGameICE1
{
    
    /**
     * @param args the command line arguments
     */
     
      
    public static void main(String[] args)
    {
        //Two Scanners for the two user variables
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           //the setters calling for methods that randomly generate suits and values.
           c.setValue(Card.randomValue());
           c.setSuits(Card.randomSuit());
           magicHand[i]=c;//saving object in array
           
           
        }
        
        //Two user variables for creating user card
        int userValue;
        String userSuit;
        
        System.out.println("Please enter a value:");
        userValue = input.nextInt();
        System.out.println("Please enter a suit:");
        userSuit = input2.nextLine();
        
        //Another for loop for comparing magicHand to user variables
        for (int j=0; j<magicHand.length;j++) {
            
            //If check for whether or not the cards match.
        if (magicHand[j].getValue() == userValue && userSuit.equals(magicHand[j].getSuits()))  {
               System.out.println("Your card the " + magicHand[j].getValue() + " of " + magicHand[j].getSuits() + " is in the hand!");
           } 
        }
        
        }
    }
   
    

    

  


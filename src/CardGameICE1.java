/*
Modifier: Gurjit Singh
 * Student ID: 991592634
 */

package assignment;

import java.util.Scanner;

/**
 * This class ---Insert Description Here---
 *
 * @author Gurjit Singh
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
          c.setValue((int)(Math.random()*13)+1);
          c.setSuits(c.SUIT((int)(Math.random()*4)));
           magicHand[i]=c;//saving object in array
         System.out.println(c.getSuits()+""+c.getValue());
        }
     int value;
     String suit;
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter suit?");
     suit = input.nextLine();
     System.out.println("Please enter a value?");
     value = input.nextInt();
     boolean flag = false;
     for(int i = 0; i< magicHand.length; i++)
     {
      if(value==magicHand[i].getValue()&&suit.equals(magicHand[i].getSuits()))
        {
            System.out.println("Your card is in the array");
            flag = true;
        }
     }
         if(flag ==false)
         System.out.println("Sorry your card is not in the Array?");
    }
    }



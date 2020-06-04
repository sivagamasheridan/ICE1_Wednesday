/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogheneruona_Omamohwo_ICE1;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */

import static Ogheneruona_Omamohwo_ICE1.Card.SUITS;
import java.util.Scanner;
public class CardGameICE1
        
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
         Card c= new Card();//object
        for (int i=0;i<magicHand.length;i++)
        {
         //  c.setValue(method to generate random value from 1 to 13);
         c.setValue(i);      
         //  c.setSuits(method random suits 
         c.setSuits("i"); 
          
            System.out.println(""+c.getSuits()+" "+c.getValue()+"");
             magicHand[i]=c;//saving object in array
        }
    //take input from user and compare with array 
        System.out.println("");
        System.out.println("Enter Any Card Value :");
    
         int value= input.nextInt();
         
         System.out.println("Enter Any Card Suit ");
         String suits=input.next();
         
        if ((value==c.getValue())&&(suits.equalsIgnoreCase(c.getSuits())))
        {
            System.out.println("Your Card is in the array");
        }
        else{
        System.out.println("Card is not in the array");}      
    
    }
    
}

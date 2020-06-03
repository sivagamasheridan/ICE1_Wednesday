/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Scanner;

/**
 *
 * @author srinivsi
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
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue(c.randomValue());
           c.setSuits(c.randomSuit());
           magicHand[i]=c;//saving object in array
        }
    //take input from user and compare with array 
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number 1 to 13");
    int value = scan.nextInt();
    System.out.println("Enter a suit > hearts, diamonds, clubs, spades");
    String suit = scan.next();
    
    System.out.println("THE HAND WAS > ");
    
    for(int a = 0; a < 7; a++)
    {
        
        System.out.println(magicHand[a].getValue() + " of " + magicHand[a].getSuits());
    }
    
    for(int b = 0; b < 7; b++)
    {
        if(magicHand[b].getValue() == value)
        {
            System.out.println("Value Match");
        }
        if(magicHand[b].getSuits() == suit)
        {
            System.out.println("Suit Match");
        }
    }
    
    }
    
}

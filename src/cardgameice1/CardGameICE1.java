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
        Scanner input = new Scanner(System.in);
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue((int) Math.floor(Math.random() * 13 + 1));
           c.setSuits(Card.SUITS[(int)Math.floor(4 * Math.random())]);
           magicHand[i]=c;//saving object in array
           System.out.println(c.getValue() + " " + c.getSuits());
        }
        System.out.println("Please enter a value:");
        int userValue = input.nextInt();
        System.out.println("Please enter a suit:");
        String userSuit = input.nextLine();
        
        while()
        
       
    //take input from user and compare with array 
   // value=
       //     suit =
    //Need to make a method to generate random values
    }
    
}

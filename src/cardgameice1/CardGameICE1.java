/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 * modifier @parita_bhatt
 * Student Number: 991585364
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
        
        
        // code to generate 7 random cards and store in array
   Card[] magicHand = new Card[7];//array of object
   for (int i=0;i<magicHand.length;i++){
           Card c= new Card();  //object
           
         
         
         c.setValue((int) (Math.random() * 13 )+ 1); //  c.setValue(method to generate random value from 1 to 13);
         int temp = (int)(Math.random()*4);
         c.setSuits(Card.SUITS[temp]);       //  c.setSuits(method random suits)
        
         //saving object in array
           magicHand[i]=c;
           System.out.println(magicHand[i].getSuits()+"" + magicHand[i].getValue());
   }   
        
       
        //take input from user and compare with array 
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter card value- ");
        int value = input.nextInt();
        System.out.println("Enter card suit-");
        String suits = input.next();
        
        
        Card magicCard = new Card();
         magicCard.setValue(value);
        magicCard.setSuits(suits);
       
        boolean win= false;
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue()== magicCard.getValue()
                    && magicHand1.getSuits().equals(magicCard.getSuits())){
                win=true;
                break;
            }
        }
            if(win==true)
            {
                System.out.println("User card is in magic Hand.");
            }
            else
            {
                System.out.println("User Card is not in magic Hand.");
            }
          
    }       
}

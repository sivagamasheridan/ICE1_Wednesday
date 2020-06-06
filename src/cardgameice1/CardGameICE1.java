/*
student id: 991589493
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author aditi
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
        Scanner input=new Scanner(System.in);
        int cardNum=0;
        String cardType;
        boolean x=false;
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
                for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           c.setValue(c.randomCardNum());
           c.setSuits(c.randomCardType());
           magicHand[i]=c;//saving object in array
           c.getSuits();  
           c.getValue();
        }

       
        System.out.println("Choose type of card(diamond,spade,club and heart):");
        cardType=input.nextLine();
        System.out.println("choose a card Number(1-13):");
        cardNum= input.nextInt();
       for (int i = 0; i<magicHand.length; i++) {
            if (cardNum == magicHand[i].getValue() &&
                    cardType.equalsIgnoreCase(magicHand[i].getSuits())) {
                x = true;
                System.out.println("Congrats your card matched.");
                break;
            }
        }
        if (x== false){
            System.out.println("Your card didn't match. Good luck for next time!!");
        }

        }
   
    
    }
    


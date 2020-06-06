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
 *@ modifier Parminder Kaur Puri
 * Studnet ID: 991586782
 
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
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
          c.setValue((int)(Math.random()*13)+1);
          c.setSuits(c.SUITS[(int)(Math.random()*4)]);
           magicHand[i]=c;//saving object in array
           System.out.println(c.getSuits()+""+c.getValue());
        }
        int value;
        String suit;
         System.out.println("Enter the suit:");
          suit = sc.nextLine();
        System.out.println("Enter the value:");
        value = sc.nextInt();

        boolean par = false;
        for(int i = 0; i < magicHand.length; i++) {
            if (value == magicHand[i].getValue() && suit.equals(magicHand[i].getSuits())) {
                System.out.println("Your card is in magic hands ");
                par=true;
            }
        }
        if(par==false)
            System.out.println("Your card is not in magic hands");
       
    }
}

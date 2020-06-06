/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Scanner;
import java.util.Arrays;
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
        
        Scanner scan=new Scanner(System.in);
        // code to generate 7 random cards and store in array
        int comp= (int)Math.floor(Math.random()*13+1);
        
        int meValue;
        String meSuits;
        Card obj=new Card();
         Card c= new Card();//object
        
//        System.out.println(comp);
//        System.out.println(comp2);
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
          int comp2=(int)Math.floor(Math.random()*4+1);
         c.setValue(((int)(Math.random()*13)+1));
         
         if(comp2==1){
             c.setSuits("Diamonds");
         }
         else if(comp2==2){
             c.setSuits("clubs");
         }
         else if(comp2==3){
             c.setSuits("spades");
         }
         else
             c.setSuits("hearts");
         //  c.setSuits(comp2);
         //  c.setValue(method to generate random value from 1 to 13);
         //  c.setSuits(method random suits);
           magicHand[i]=c;//saving object in array
           meValue=magicHand[i].getValue();
           meSuits=magicHand[i].getSuits();
           System.out.println(meSuits+" "+meValue);
        }
        
         System.out.println("enter suit");
        String suitss=scan.next();
        
        System.out.println("Please enter card number");
        int value=scan.nextInt();
        
      
        
        
        
        
        
        
        
        
        
             }
             
    
}

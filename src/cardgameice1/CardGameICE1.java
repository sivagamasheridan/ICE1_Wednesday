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
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // code to generate 7 random cards and store in array
        int comp= (int)Math.floor(Math.random()*13+1);
        int comp2=(int)Math.floor(Math.random()*4+1);
        
        Card obj=new Card();
        
//        System.out.println(comp);
//        System.out.println(comp2);
        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
         c.setValue(comp);
         //  c.setValue(method to generate random value from 1 to 13);
         //  c.setSuits(method random suits);
           magicHand[i]=c;//saving object in array
           System.out.println(magicHand[i]);
        }
       
    //take input from user and compare with array 
   // value=
       //     suit =
    //xD CCC
    }
    
}

/*
 * Kirat Mehta
 * ICE1 Assignment
 * Student Id- 991587670
 */
package cardgameice1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author KiratMehta
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
        
     
        Card obj=new Card();
         Card c= new Card();//object
        

        Card[] magicHand = new Card[7];//array of object
        for (int i=0;i<magicHand.length;i++)
        {
          int comp2=(int)Math.floor(Math.random()*4+1);
         c.setValue(((int)(Math.random()*13)+1));
         c.setSuits(c.SUITS[(int)(Math.random()*4)]);
        
           magicHand[i]=c;//saving object in array
           
           System.out.println(c.getSuits()+" "+c.getValue());
        }
        
         System.out.println("enter suit");
        String suitss=scan.next();
        
        System.out.println("Please enter card number");
        int valueNum=scan.nextInt();
        
        boolean check=false;
        int counter=0;
        
        for(int i=0;i<magicHand.length;i++){
            if(magicHand[i].getValue()==valueNum&&suitss.equals(magicHand[i].getSuits())){
                System.out.println("your card is in the array");
                check=true;
                break;
            }
            
            }
        if(check==false){
                System.out.println("your card is not in array");
        }
      
        
        
        
        
        
        
        
        
        
             }
             
    
}

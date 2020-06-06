/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class TesterCard {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        for(int i = 0; i< magicHand.length;i++){
           Card c = new Card();
        
           c.setValue((int)(Math.random()*13+1));
           c.setSuits(c.SUITS[(int)(Math.random()*4)]);
           magicHand[i] = c;
             System.out.println(magicHand[i].getSuits() + " " + magicHand[i].getValue());
        }

int value;
String suit;
System.out.println("Enter the value:");
 value = in.nextInt();
System.out.println("Enter the Suit:" );
 suit = in.nextLine();
 System.out.println("This is in array list");
}
}

    


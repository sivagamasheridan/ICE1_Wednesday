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
        Card[] magicHand = new Card[7];//array of object
     Random random = new Random();
        for (int i=0;i<magicHand.length;i++)
        {
         int value = random.nextInt(13) + 1;
         String suits = Card.SUITS[random.nextInt(4)];
         Card card = new Card(value , suits);
         //  c.setValue(method to generate random value from 1 to 13);
         //  c.setSuits(method random suits);
           magicHand[i]=c;//saving object in array
        }
     System.out.println("Choose a suit");
     for( int i = 0; i< Card.SUITS.length; i++){
      System.out.println("Enter the value (1 to 13)");
    //take input from user and compare with array 
      int suit = input.nextInt();
      System.out.println("Enter the value (1 to 13)");
      int value= input.nextInt();
      Card userGuess = new Card(value, Card.SUITS[suit - 1]);
      boolean math = false;
      for (Card card : magicHand) {
       if (card.getValue() == userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())) {
        match = true;
        break;
       }
      }
      System.out.println("You have a match : " + match);
      System.out.println("Here are the cards: ");
      for(Card card : magicHand) {
       System.out.printf("%d of %s\n" , card.getValue(), card.getSuit());
      }
       
    }
    
}

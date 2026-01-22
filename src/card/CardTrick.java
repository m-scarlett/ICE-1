/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @modifier Madison Scarlett 991840867
 * @author srinivsi
 */

import java.util.Random;
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[3]);

        System.out.println(
            "Lucky Card: " 
            + luckyCard.getValue() + " of " 
            + luckyCard.getSuit()
        );



        
        System.out.println("\nMagic Hand:");

        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(
                    (i + 1) + ": "
                    + magicHand[i].getValue() + " of "
                    + magicHand[i].getSuit()
            );
        }

       

        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Card NOT found in the magic hand.");
        }


    }
    
}

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
        //insert code to ask the user for Card value and suit, create their card using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick any card!");
        System.out.print("\nEnter the card value (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Enter the card suit (Hearts = 0, Diamonds = 1, Spades = 2, Clubs = 3): ");
        int suit = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("\nMagic Hand:");

        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(
                    (i + 1) + ": "
                    + magicHand[i].getValue() + " of "
                    + magicHand[i].getSuit()
            );
        }


        // and search magicHand here
        Card usersCard = new Card();
        usersCard.setValue(value);
        usersCard.setSuit(Card.SUITS[suit]);

        boolean found = false;

        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == usersCard.getValue()
                    && magicHand[i].getSuit().equals(usersCard.getSuit())) {

                //Then report the result here
                System.out.println("Card FOUND at position " + i+1);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Card NOT found in the magic hand.");
        }

        
        // add one luckcard hard code 2,clubs
    }
    
}

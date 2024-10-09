package Aanand_n01712678.Array;

import java.util.Random;

public class Activity_4 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
        String[] deck = new String[52];

        // Initialize the deck
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        // Swap two randomly selected cards
        int firstCardIndex = random.nextInt(52);
        int secondCardIndex = random.nextInt(52);
        String temp = deck[firstCardIndex];
        deck[firstCardIndex] = deck[secondCardIndex];
        deck[secondCardIndex] = temp;

        // Print the deck after swapping
        System.out.println("Deck after swapping:");
        for (String card : deck) {
            System.out.println(card);
        }

        // Select 4 random cards
        int[] random_cards = new int[4];
        for (int i = 0; i < 4; i++) {
            random_cards[i] = random.nextInt(52);
        }

        // Print the selected random cards
        System.out.println("\nSelected random cards:");
        for (int i = 0; i < 4; i++) {
            System.out.println(deck[random_cards[i]]);
        }

    }
}

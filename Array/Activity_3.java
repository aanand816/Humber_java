package Aanand_n01712678.Array;

import java.util.Random;

public class Activity_3 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
        String[] deck = new String[52];
        int[] random_cards = new int[4];

        for (int i = 0; i < 4; i++) {
            random_cards[i] = random.nextInt(52);
        }
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        System.out.println("The random cards are: ");
        // Print the deck to verify
        for (int i = 0; i <4 ; i++) {
            System.out.println(deck[random_cards[i]]);

        }
    }
}


package Aanand_n01712678.Activity_2;

import java.util.Scanner;
import java.util.Random;

public class input {
    public static void main(String[] args) {
        // Create a random lottery number between 00 and 99
        Random rand = new Random();
       int lottery = rand.nextInt(99); // Generates a number between 0 and 99

        // Get the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits 00-99): ");
        int userGuess = input.nextInt();

        // Extract digits from the lottery number
        int lotteryDigit1 = lottery / 10;  // First digit of lottery
        int lotteryDigit2 = lottery % 10;  // Second digit of lottery

        // Extract digits from the user's guess
        int guessDigit1 = userGuess / 10;  // First digit of user's guess
        int guessDigit2 = userGuess % 10;  // Second digit of user's guess

        // Display the lottery number with two digits
        System.out.printf("The lottery number is %02d\n", lottery);

        // Check the user guess against the lottery number
        if (userGuess == lottery) {
            System.out.println("Exact match: you win $10,000!");
        } else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)) {
            System.out.println("All digits match: you win $3,000!");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("One digit matches: you win $1,000!");
        } else {
            System.out.println("Sorry, no match.");
        }
    }
}


package Aanand_n01712678.Assignment_1;

import java.util.Scanner;
import java.util.Random;

public class Question_1 {
    public static void main(String[] args) {
        //initialized the scanner class
        Scanner sc = new Scanner(System.in);
        // Create a random lottery number between 00 and 99
        Random rand = new Random();
        int lottery = rand.nextInt(99); // Generates a number between 0 and 99

        // Extract digits from the lottery number
        int lottDigit1 = lottery / 10;  // First digit of lottery
        int lottDigit2 = lottery % 10;  // Second digit of lottery

        // Get the user input
        System.out.print("Enter your lottery pick (two digits 00-99): ");
        int userGuess = sc.nextInt();

        // Extract digits from the user's guess
        int userDigit1 = userGuess / 10;  // First digit of user's guess
        int userDigit2 = userGuess % 10;  // Second digit of user's guess

        // Display the lottery number with two digits
        System.out.printf("The lottery number is %02d\n", lottery);

        // Check the user guess against the lottery number
        if (userGuess == lottery) {
            System.out.println("Exact match: you win $10,000!");
        } else if ((userDigit1 == lottDigit2 && userDigit1 == lottDigit1)) {
            System.out.println("All digits match: you win $3,000!");
        } else if (userDigit1 == lottDigit1 || userDigit1 == lottDigit2 ||
                userDigit2 == lottDigit1 || userDigit2 == lottDigit2) {
            System.out.println("One digit matches: you win $1,000!");
        } else {
            System.out.println("Sorry, no match.");
        }
    }
}


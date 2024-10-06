package Aanand_n01712678.Assignment_1;

import java.util.Random;
import java.util.Scanner;

public class Question_2{
    //function to check who won the game as many times
    public static void game(String u_guess, String c_guess) {
        if ((u_guess.equals("rock") && c_guess.equals("paper")) || (u_guess.equals("paper") && c_guess.equals("scissor")) || (u_guess.equals("scissor") && c_guess.equals("rock"))) {
            System.out.println("\nThe computer is "+ c_guess + ". You are " + u_guess +".  *Computer Won* ");
        } else if ((u_guess.equals("paper") && c_guess.equals("rock")) || (u_guess.equals("scissor") && c_guess.equals("paper")) || (u_guess.equals("rock") && c_guess.equals("scissor"))) {
            System.out.println("\nYou are "+ u_guess +". Computer is "+ c_guess+ ". *You won*");
        } else {
            System.out.println("\nIt's a draw :)");
        }
    }

    public static void main(String[] args) {
        //Initialized the scanner class
        Scanner sc = new Scanner(System.in);
        //Getting the computer's input
        Random random = new Random();
        String[] option = {"rock", "paper", "scissor"};
        int number;
        String user_guess, com_guess;

        //taking input from user
        System.out.println("\nChoose one from the following:\n1.Rock \n2.Paper\n3.Scissor  ");
        System.out.print("Enter your choice: ");
        user_guess = sc.nextLine().toLowerCase();
        //getting the computer input
        number = random.nextInt(3);
        com_guess = option[number];
        //checking the user input also assigning the value
        if (user_guess.equals("1") || user_guess.equals("rock")) {
            user_guess = "rock";
        } else if (user_guess.equals("2") || user_guess.equals("paper")) {
            user_guess = "paper";
        } else if (user_guess.equals("3") || user_guess.equals("scissor")) {
            user_guess = "scissor";
        } else {
            System.out.println("\nPlease Enter the correct value :(");
        }
        //calling the function.
        game(user_guess, com_guess);
    }
}


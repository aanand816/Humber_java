package Aanand_n01712678.Assignment_1;

import java.util.Random;
import java.util.Scanner;

public class Question_3{
    //global variable for accessing the winning number of user and computer
    public static int comp_count = 0, user_count = 0;

    //function to check who won the game as many times
    public static void game(String u_guess,String c_guess){
        //checking if the computer won
        if ((u_guess.equals("rock") && c_guess.equals("paper")) || (u_guess.equals("paper") && c_guess.equals("scissor")) || (u_guess.equals("scissor") && c_guess.equals("rock"))){
            comp_count++;
            System.out.println("\nThe computer is "+ c_guess + ". You are " + u_guess +". Computer Won " + comp_count +" time");
            if (comp_count==3){
                System.out.println("Computer won the game :( ");
                comp_count++;
            }
            //checking if the user won
        } else if ((u_guess.equals("paper") && c_guess.equals("rock")) || (u_guess.equals("scissor") && c_guess.equals("paper")) || (u_guess.equals("rock") && c_guess.equals("scissor"))) {
            user_count++;
            System.out.println("\nYou are "+ u_guess +". Computer is "+ c_guess+ ". You won " + user_count+" time");
            if (user_count==3){
                System.out.println("You won the game :)");
                user_count++;
            }
            //checking if it's a draw
        }else{
            System.out.println("\nYou are "+ u_guess +". Computer is "+ c_guess+ ". It's a draw :)");
        }
    }
    public static void main(String[] args) {
        //Initialized the scanner class
        Scanner sc = new Scanner(System.in);

        //Getting the computer's input
        Random random = new Random();
        String[] option = {"rock", "paper", "scissor"};
        int number;
        String user_guess, com_guess,decision;
        while (true) {
            if (user_count < 3 && comp_count < 3) {
                //asking for the input
                System.out.println("\nChoose one from the following: 1.Rock | 2.Paper | 3.Scissor  ");
                System.out.print("Enter your choice: ");
                user_guess = sc.nextLine().toLowerCase();
                number=random.nextInt(3);
                com_guess=option[number];
                //checking the input as well as assigning the value
                if (user_guess.equals("1") || user_guess.equals("rock")) {
                    user_guess = "rock";
                } else if (user_guess.equals("2") || user_guess.equals("paper")) {
                    user_guess = "paper";
                } else if (user_guess.equals("3") || user_guess.equals("scissor")) {
                    user_guess = "scissor";
                }else{
                    System.out.println("\nPlease Enter the correct value :(");
                }
                game(user_guess,com_guess);
            }else{
                System.out.print("\nDo you want to play this game again press Y for Yes and N for No : ");
                decision=sc.nextLine().toLowerCase();
                if (decision.equals("n") || decision.equals("no")){
                    System.out.println("\n\tThank you for playing this Game :) ");
                    break;
                }else if(decision.equals("y") || decision.equals("yes")){
                    user_count=0;
                    comp_count=0;
                    System.out.println("\n\t**Lets play this game again :) **");
                }else{
                    System.out.println("\n**Please enter the correct value :( ");
                }
            }
        }
    }
}


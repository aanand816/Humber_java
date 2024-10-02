package Aanand_n01712678.Activity_4;

import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {
    public static void main(String[] args) {
        //initializing the scanner class
        Scanner sc = new Scanner(System.in);
        //initializing the random class
        Random random = new Random();

        int ran = random.nextInt(101);
        int num = 0;
        //heading of the program
        System.out.println("\n\tGuessing the Number**\n");
        //setting the condition for the loop
        boolean condition = true;
        while (condition) {
            //getting the number from user
            System.out.print("Enter the number : ");
            //storing the value
            num = sc.nextInt();
            //checking the value
            if (num > 100) {
                System.out.println("please enter the number less than 100");
            } else if (num == ran) {
                System.out.println("You guessed the Correct number ");
                condition = false;
            } else if (num < ran) {
                System.out.println("Too small number");
            } else{
                System.out.println("Too big number");
            }
        }
    }
}

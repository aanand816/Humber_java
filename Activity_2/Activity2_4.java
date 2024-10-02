package Aanand_n01712678.Activity_2;

import java.util.Random;
import java.util.Scanner;

public class Activity2_4 {

    public static void main(String[] args) {
        //initialize the scanner class
        Scanner sc = new Scanner(System.in);
        //initialize the random class
        Random random = new Random();
        //storing the first random number
        int a = random.nextInt(10);
        //storing the second random number
        int b = random.nextInt(10);
        //printing the statement for the user
        System.out.print("Calculate the " +a + " + " + b +" : "  );
        //storing the user's answer
        int ans = sc.nextInt();
        //checking if the answer is correct
        boolean x = (a+b) == ans;
        //printing the result
        System.out.println("Your ans is : " + x);
    }
}

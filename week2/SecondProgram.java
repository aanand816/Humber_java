package Aanand_n01712678.week2;

import java.util.Scanner;

public class SecondProgram {
    //this is the program for calculator

    public static void main(String[] args) {
        int a, b, choice;
        // float ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\t\t*** Calculator ***");

        System.out.println(" 1.Addition \n 2.Subtraction \n 3.Division \n 4.Multiplication ");
        System.out.print("\nWhich operation you want to perform : ");
        choice = sc.nextInt();
        System.out.print("\nEnter the first Number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();

        if (choice == 1) {
            System.out.println("\nYour Addition of " + a + " and " + b + " is " + (a + b));
        } else if (choice == 2) {
            System.out.println("\nYour Subtraction of " + a + " and " + b + " is " + (a - b));
        } else if (choice == 3) {
            if (b < 1) {
                System.out.println("\nDivision with 0 is not possible ");
            } else {
                System.out.println("Your Division of " + a + " and " + b + " is " + (float) (a / b));
            }
        } else if (choice == 4) {
            System.out.println("\nYour Multiplication of " + a + " and " + b + " is " + (a * b));
        } else {
            System.out.println("\n\t**Please enter the correct option ");
        }
        System.out.println("\n\tThankyou for using our Calculator :)");
    }
}

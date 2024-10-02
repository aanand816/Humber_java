package Aanand_n01712678.Activity_2;

import java.util.Scanner;

public class Activity2_6 {
    public static void main(String[] args) {
        //initializing the scanner class
        Scanner sc = new Scanner(System.in);
        //heading of the program
        System.out.println("\n\tSwitch Case Program**\n");
        //asking for the input
        System.out.print("Enter the year : ");
        //saving the input
        int year = sc.nextInt();
        //getting the remainder for our output
        int animal = year % 12;
        //switching the correct answer
        switch (animal) {
            case 0:
                System.out.println("For year " + year + " Animal is Monkey");
                break;
            case 1:
                System.out.println("For year " + year + " Animal is Rooster");
                break;
            case 2:
                System.out.println("For year " + year + " Animal is Dog");
                break;
            case 3:
                System.out.println("For year " + year + " Animal is Pig");
                break;
            case 4:
                System.out.println("For year " + year + " Animal is Rat");
                break;
            case 5:
                System.out.println("For year " + year + " Animal is OX");
                break;
            case 6:
                System.out.println("For year " + year + " Animal is Tiger");
                break;
            case 7:
                System.out.println("For year " + year + " Animal is Rabbit");
                break;
            case 8:
                System.out.println("For year " + year + " Animal is Dragon");
                break;
            case 9:
                System.out.println("For year " + year + " Animal is snake");
                break;
            case 10:
                System.out.println("For year " + year + " Animal is Horse");
                break;
            case 11:
                System.out.println("For year " + year + " Animal is Sheep");
                break;
            default:
                System.out.println("Please enter the correct value");
        }
        sc.close();
    }
}

package Aanand_n01712678.Activity_4;

import java.util.Scanner;

public class Activity4_5 {
    public static void main(String[] args) {
        //initialized the scanner class
        Scanner sc = new Scanner(System.in);
        //initialized the variables
        int greatest_divisor=0,divisor = 0;
        //heading of the program
        System.out.println("\n\t**Finding Greatest Common Divisor**");
        //asking for the input
        System.out.print("\nPlease enter the first number: ");
        int first = sc.nextInt();
        System.out.print("\nPlease enter the second number: ");
        int second = sc.nextInt();
        int min = Math.min(first, second);
        if (first % 2 == 0 && second % 2 == 0) {
            divisor=2;
        } else {
            divisor=1;
        }
        while (divisor < min) {
            if (first%divisor == 0 && second % divisor == 0 ){
                greatest_divisor=divisor;
            }
            divisor = divisor + 2;
        }
        System.out.println("\nGreatest Divisor number is : "+ greatest_divisor);
    }
}

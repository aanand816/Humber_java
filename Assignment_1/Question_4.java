package Aanand_n01712678.Assignment_1;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        //initializing the scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number from 1 to 15 : ");
        int n = sc.nextInt();
        if (n <= 15) {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Please enter the number from 1 to 15 :)");
        }
    }
}
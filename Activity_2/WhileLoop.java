package Aanand_n01712678.Activity_2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean limit = true;
        while (limit = true) {
            System.out.println("Program for Palindromic Pattern\n ");
            System.out.print("Enter the size of Palindrom : ");
            int n = sc.nextInt();
            if (n < 0 || n > 15) {
                System.out.println("Please Enter a valid number from 1 to 15 :)");
                for (int i = 1; i <= n; i++) {
                    // for spaces
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print("  ");
                    }
                    // for reverse printing
                    for (int j = i; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                    // for forward pringting
                    for (int j = 2; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println("");
                }
            }
        }
    }
}

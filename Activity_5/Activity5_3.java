package Aanand_n01712678.Activity_5;

import java.util.Scanner;

public class Activity5_3 {

    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= x) {
            if (x % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        int n = sc.nextInt();

        int count = 0; // Count of prime numbers found
        int num = 2;   // Number to be checked for primality

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

}

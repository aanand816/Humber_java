package Aanand_n01712678.Assignment_2;

import java.util.Scanner;

public class SumOfDigit {

    public static long sumDigits(long n) {
        long sum =0;
        while (n!=0){
            sum = (sum + (n%10));
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t**Calculating the sum of digits.");
        System.out.print("\nEnter the number : ");
        SumOfDigit s1 = new SumOfDigit();
        long number= sc.nextLong();
        long sum = sumDigits(number);
        System.out.printf("\nThe sum of digits of %d is %d\n", number, sum );
    }

}

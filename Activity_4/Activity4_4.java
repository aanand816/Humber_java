package Aanand_n01712678.Activity_4;

import java.util.Scanner;

public class Activity4_4 {
    static boolean isPrime(int x){
        if (x<=1){
            return false;
        }
        int c = 2 ;
        while (c*c<=x){
            if (x%c==0){
                return false;
            }
            c++;
        }
        return c*c>x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t**Check the number is it Prime of not**");
        System.out.print("\nPlease enter the number: ");
        int n =sc.nextInt();
        boolean ans = isPrime(n);
        if (ans) {
            System.out.println("\n"+n+" is the prime number :)");
        }else{
            System.out.println("\n"+n+" is not the prime number :(");
        }
        sc.close();
    }
}

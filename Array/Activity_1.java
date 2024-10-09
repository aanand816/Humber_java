package Aanand_n01712678.Array;

import java.util.Scanner;

public class Activity_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  average, count=0,total=0;
        int[] a = new int[10];
        for (int i = 0; i < 10 ; i++) {
            System.out.print("Enter the " + (i+1) + " number :");
            a[i]=sc.nextInt();
            total =total+a[i];
        }
        average=total/10;
        System.out.println("Average of the numeber is " + total/10);
        for (int i = 0; i < 10 ; i++) {
            if (a[i] > average) {
                count=count+1;
            }
        }
        System.out.println("There are " + count +" number");

    }
}

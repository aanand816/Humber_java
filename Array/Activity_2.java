package Aanand_n01712678.Array;

import java.util.Scanner;

public class Activity_2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int  max=0;
            int[] a = new int[10];
            for (int i = 0; i < 10 ; i++) {
                System.out.print("Enter the " + (i+1) + " number :");
                a[i]=sc.nextInt();
            }
            max = -100000;
            for (int i = 0; i < 10-1; i++) {
                max=Math.max(max,a[i+1]);
            }
            System.out.println("The maximum number is "+max);
        }

}

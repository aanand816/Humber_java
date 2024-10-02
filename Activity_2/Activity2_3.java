package Aanand_n01712678.Activity_2;

import java.util.Scanner;

public class Activity2_3 {
    public static void main(String[] args) {
        //initialize the scanner class
        Scanner sc = new Scanner(System.in);
        //asking for value
        System.out.print("Enter the fahrenheit value : ");
        //storing the value
        double far = sc.nextInt();
        //calculating the celsius
        double celsius = ((5.0 / 9) * (far - 32));
        //printing the output
        System.out.printf("%.2f",celsius);

    }
}

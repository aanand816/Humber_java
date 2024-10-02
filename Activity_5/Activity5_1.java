package Aanand_n01712678.Activity_5;

import java.util.Scanner;

public class Activity5_1 {

    public static int sum(int a, int b) {
        int sum = 0 ;
        for (int i = a; i <=b ; i++) {
            sum=sum + i;
        }
        return sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int first,second,total=0;
        System.out.println("\n\tSum of the integers");
        boolean decision = true,ans= true;
        while (decision) {
            System.out.print("\nEnter the starting number: ");
            first = sc.nextInt();
            System.out.print("Enter the Ending number: ");
            second = sc.nextInt();
            total = sum(first,second);
            System.out.println("Sum of the number from " + first + " to " + second + " is " + total);
            sc.nextLine();
            System.out.print("\nDo you want to calculate again Press Y for Yes || N for No: ");
            input = sc.nextLine().toLowerCase();
            if (input.equals("y")) {
                decision = true;
            } else {
                decision = false;
            }
        }
    }
}

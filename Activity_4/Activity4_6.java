package Aanand_n01712678.Activity_4;

import java.util.Scanner;

public class Activity4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plus = 2,greatest_divisor=0,divisor = 0;
        System.out.println("\n\t**Printing the Different Patterns**");
        System.out.println("\nType of the Patterns");
        System.out.println("1.Pattern A \n2.Pattern B \n3.Pattern C");
        System.out.print("Chose the Type of the pattern : ");
        String input = sc.nextLine().toLowerCase(); // Convert input to lowercase to handle 'A', 'B', 'C'
        System.out.print("Enter the numbers of line you want : ");
        int n = sc.nextInt();
        switch(input){
            case "1":
            case "a":
                System.out.println("\n\t**Pattern A** ");
                for(int i = 1 ; i <=n ; i++){
                    for (int j = 1; j <=i ; j++) {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;
            case "2":
            case "b":
                System.out.println("\n\t**Pattern B** ");
                for(int i = 0 ; i <n ; i++){
                    for (int j = 1; j <=(n-i) ; j++) {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;
            case "3":
            case "c":
                System.out.println("\n\t**Pattern C** ");
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < (n-i); j++) {
                        System.out.print("  ");
                    }
                    for (int j = i; j >=1 ; j--) {
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + input);
        }
    }
}


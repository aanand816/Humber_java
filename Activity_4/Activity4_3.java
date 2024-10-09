package Aanand_n01712678.Activity_4;

import java.util.Scanner;

public class Activity4_3 {
    public static void main(String[] args) {
    int num, col, start = 1, end = 10;
    Scanner sc = new Scanner(System.in);
    //This code will print multiple tables horizontally
    //we can assign the end number of the table and after every 10 printing tables the cursor will move to next column
    System.out.println("\n\t\t**This is the program to print Table horizontally**\t\n");
    System.out.println("The table will start from 1 to till the number enter by you ");
    System.out.print("Enter the last number of table : ");
    num=sc.nextInt();
    col = num / 10;//setting the column of 10 for every row

    for (int i = 1; i <= col+1; i++) {
        // i loop is checking how many rows will print
        for (int j = 1; j <= 10; j++) {
            // j is working as number form 1 - 10 to be multiply  with the every number
            for (int k = start; k <= end; k++) {
                // k is working with the table number
                System.out.printf("%-5d  ", k * j);
                // %-2d  this is used to fix the column size of every value
            }
            System.out.println();
        }
        start = end + 1;//assigning the next value of last printed table
        end = Math.min(num, 10 * (i + 1)); //will check the last number for printing all the tables
        System.out.println();
    }
    sc.close();
}

}

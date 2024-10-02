package Aanand_n01712678.Activity_4;

import java.util.Scanner;

public class Activity4_2 {
    public static void main(String[] args) {
        //initialized the scanner class
        Scanner sc = new Scanner(System.in);
        //declare and initialized the variables
        double num, sum=0 ;
        //set the condition for the while loop
        boolean condition = true;
        while (condition){
            //getting the input
            System.out.print("Please enter a value : ");
            //storing the input
            num= sc.nextDouble();
            //calculating the sum
            sum = sum + num;
            //checking for the stopping condition
            if (num<=0){
                System.out.printf("The sum of the numbers is : %.1f", sum);
                //stopping the program
                condition=false;
            }
        }
    }
}

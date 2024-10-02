//package in which the code is created
package Aanand_n01712678.Activity_1;
//imported java util class for the scanning the input

import java.util.Scanner;

//declared the class name
public class Activity_1_2 {
    //from main this program will run
    public static void main(String[] args) {
        //initialise the km_per_miles as final as I will remain constant throughout the program
        final double KILOMETERERS_PER_MILES = 1.609;
        //declared  the variable for the miles and  kilometers
        double kilometers, miles;
        //instance variable for the Scanner class
        Scanner sc = new Scanner(System.in);
        //taking input from the user
        System.out.print("\nPlease enter the value of miles : ");
        //storing the value in the miles variable
        miles = sc.nextDouble();
        //converting the miles into kilometeres
        kilometers = KILOMETERERS_PER_MILES * miles;
        //printing the output of the conversion
        System.out.println("\nThe conversion of " + miles + " miles into kilometer is " + kilometers);
        //endind statement of the program
        System.out.println("\n\t***Thankyou for using our converter :) ***");
    }
}

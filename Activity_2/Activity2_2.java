package Aanand_n01712678.Activity_2;

import java.util.Scanner;

public class Activity2_2 {

    public static void main(String[] args) {
        //initialize and declared teh variables
        int hour = 0, sec, min;
        //initialize the scanner class
        Scanner sc = new Scanner(System.in);
        //asking the input from the user
        System.out.print("Enter the seconds: ");
        // storing the value of second
        sec = sc.nextInt();
        //calculating the hours
        hour=sec/(60*60);
        //calculating the minutes
        min = (sec/60)%60;
        //calculating the seconds
        sec = sec % 60;
        //printing the output
        System.out.println(hour + " hours " + min + " minutes " + sec + " seconds");
    }
}

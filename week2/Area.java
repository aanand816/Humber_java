package Aanand_n01712678.week2;

import java.util.Scanner;

public class Area {


    public static void main(String[] args) {
        //declaring the PI value as final as it is fixed
        final float PI = 3.14F;
        //radius of the circle
        float radius = 5.5F;
        //choice variable for the user to select from perimeter and Area
        int choice;
        //created the instance variable
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t**Program for the Circle Perimeter and radius**");
        System.out.println("1.Perimeter  \n2.Area ");
        System.out.print("What do you wanna find : ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("\nThe Perimeter of the circle is : " + (2 * radius * PI));
        } else if (choice == 2) {
            System.out.println("\nThe Area of the circle is : " + (PI * radius * radius));
        } else {
            System.out.println("\nPlease Enter the correct value :) ");
        }
    }
}

//this is the package where the codes are
package Aanand_n01712678.Activity_1;
//importing the java library for using the scanner class
import java.util.Scanner;
//declared the class name
public class Activity_1_3 {
    //main statement of the program from where the program will execute
    public static void main(String[] args) {
        //declaring the PI value as final as it is fixed
        final float PI = 3.14F;
        //heading of the program
        System.out.println("\n\t**Program for the Circle Perimeter and radius**");
        //created the instance variable of Scanner class
        Scanner sc = new Scanner(System.in);
        //choice variable for the user to select from perimeter and Area
        int choice;
        //variable for storing the radius
        float radius;
        //asking for the radius
        System.out.print("\nPlease enter the radius of the circle:");
        radius = sc.nextFloat();
        //giving option to the user
        System.out.println("\n1.Perimeter  \n2.Area ");
        //Asking users choice
        System.out.print("What do you wanna find : ");
        //storing the user's choice
        choice = sc.nextInt();
        //making decision with the users choice
        //first case is for perimeter
        if (choice == 1) {
            System.out.println("\nThe Perimeter of the circle is : " + (2 * radius * PI));
        }
        //2nd case is for the Area
        else if (choice == 2) {
            System.out.println("\nThe Area of the circle is : " + (PI * radius * radius));
        }
        //Last case if user entered some wrong value
        else {
            System.out.println("\nPlease Enter the correct value :) ");
        }
    }
}

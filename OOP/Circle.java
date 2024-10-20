package Aanand_n01712678.OOP;

import java.util.Scanner;
import java.util.Random;

public class Circle {
    public Circle(int radius,int num){
        System.out.println("\nRadius is "+ radius);
        System.out.printf("Area of circle No.%d is %.2f\n",num,(3.14*radius*radius));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        int radius;
        System.out.print("Enter the number of circle's : ");
        int circle = sc.nextInt();
        for (int i = 1; i <=circle ; i++) {
            radius=random.nextInt(20);
            Circle circle1 = new Circle(radius,i);
        }

    }
}

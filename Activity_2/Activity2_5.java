package Aanand_n01712678.Activity_2;
import java.util.Scanner;

public class Activity2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tCalculate your BMI**\n");
        System.out.print("Enter your weight in kg: ");
        float weight = sc.nextFloat();
        System.out.print("Enter your height in m: ");
        float height = sc.nextFloat();
        height = height* height;
        float bmi = weight/height;
        if (bmi< 18.5){
            System.out.printf("\nYou are Underweight \nBMI is %.2f",bmi);
        } else if (18.5 <= bmi  || bmi > 25) {
            System.out.printf("\nYou are Normal \nBMI is %.2f",bmi);
        } else if (bmi >=25 || bmi < 30) {
            System.out.printf("\nYou are overweight \nBMI is %.2f",bmi);
        }else {
            System.out.printf("You are Obesity \n BMI is %.2f",bmi);
        }
    }
}

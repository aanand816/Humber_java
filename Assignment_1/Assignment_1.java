package Aanand_n01712678.Assignment_1;

import java.util.Random;
import java.util.Scanner;

public class Assignment_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lottery =random.nextInt(99);
        System.out.print("Enter your lottery no: ");
        int usernum = sc.nextInt();

        int lotteryfirst = lottery/10;
        int lotterysecond = lottery%10;

        int guessedfirst= usernum/10;
        int guessedsecond= usernum%10;

        if (lotteryfirst == guessedfirst && lotterysecond== guessedsecond){
            System.out.println("You won the $10,000");
        } else if (lotteryfirst == guessedfirst || lotteryfirst == guessedsecond ) {
            
        }

    }
}

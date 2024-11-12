package Aanand_n01712678.Assignment_2;

import java.util.Scanner;

public class FinancialApplication {

    public static double futureInvestmentValue(double amount, float rate){
        return amount*(1+((rate/100)*1));//1000×(1+(0.05×1))
    }

    public static <doble> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value=0;
        System.out.println("\t**Financial Application");
        System.out.print("The Amount Invested:");
        double amount = sc.nextDouble();
        System.out.print("Annual Interest Rate: ");
        float interest = sc.nextFloat();
        System.out.println("Year\t\tAmount ");
        for (int i = 1; i <= 30; i++) {
            value  =  futureInvestmentValue(amount, interest  );
            System.out.println(" "+i +"\t\t"+value);
            amount=value;
        }
    }
}
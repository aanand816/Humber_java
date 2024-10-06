package Aanand_n01712678.Assignment_1;

import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {
        //initializing the scanner class
        Scanner sc= new Scanner(System.in);
        //declaring and initializing the variable
        double loan_amount,annual_interest=5,monthly_interest,monthly_payment,total_payment;
        int years,payment_count;
        //getting the loan amount
        System.out.print("Enter the Loan amount: ");
        loan_amount=sc.nextDouble();
        //getting the number of years for loan payment
        System.out.print("Enter the No. of years: ");
        years=sc.nextInt();
        //calculating the number of months
        payment_count=years*12;
        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
        //setting the loop condition
        while(annual_interest <= 8){
            //calculating the monthly interest
            monthly_interest=(annual_interest/100)/12;
            //calculating monthly payment
            monthly_payment=(loan_amount*monthly_interest*Math.pow(1+monthly_interest,payment_count))/(Math.pow(1+monthly_interest,payment_count)-1);
            //calculating the total payment
            total_payment=monthly_payment*payment_count;
            System.out.printf("\t%5.3f\t\t\t %9.2f \t\t\t%10.2f \n",annual_interest,monthly_payment,total_payment);
            //increasing the interest rate
            annual_interest=annual_interest+0.125;
        }
    }
}

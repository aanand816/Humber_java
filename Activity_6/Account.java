package Aanand_n01712678.Activity_6;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private double balace;

    public Account(){
    }

    public Account(int id, double balance){
      this.id = id;
      this.balance=balance;
      this.dateCreated = new Date();
    }

    //setter for the id
    private void setId(int id){
       this.id=id;
    }

    private  void setBalance(double balance){
        this.balance=balance;
    }
    private void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    private int getId(){
        return this.id;
    }

    private double getBalance(){
        return  this.balance;
    }

    private double getAnnualInterestRate(){
        return  this.annualInterestRate;
    }
    //creation of account date
    private Date getDateCreated(){
        return this.dateCreated;
    }

    //getting the monthly interest
    private String getMonthlyInterestRate(){
        return String.format("%.3f", ((this.annualInterestRate / 100) / 12));
    }

    private double monthlyInterest(){
        return (this.balance*((this.annualInterestRate/100)/12));
    }
    //withdrawing the money
    private void withdraw(double amount){
        this.balance-=amount;
    }

    private void deposti(double amount){
         this.balance+=amount;
    }

    public static void main(String[] args) {
        Account account = new Account(1,1000);
        System.out.println("Account Balance : "+account.getBalance());
        account.setAnnualInterestRate(15);
        System.out.println("Monthly Interest rate : "+account.getMonthlyInterestRate());
        account.deposti(500);
        System.out.println("Balance after deposit : "+account.getBalance() );
        account.withdraw(20);
        System.out.println("Balance after withdraw: "+account.getBalance());
    }


}

package com.pluralsight;

public class SavingsAccount {

    private String owner;
    private int accountNumber;
    private double balance;


    public SavingsAccount(String owner, int accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public double getBalance(){
        return this.balance;
    }

    public void Deposit(double depositAmount){
        //this.balance += depositAmount;
        this.balance = balance + depositAmount;
    }


}
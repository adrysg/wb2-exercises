package com.pluralsight;

public class BankingApp {

    public static void main(String[] args){


        SavingsAccount s1 = new SavingsAccount("Matt C", 1);
        System.out.println(s1.getBalance());

        s1.Deposit(1000);
        System.out.println(s1.getBalance());


        s1.Deposit(5);
        s1.Deposit(50);

        s1.Deposit(50);

        System.out.println(s1.getBalance());



    }
}
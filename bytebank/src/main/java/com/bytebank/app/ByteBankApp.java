package com.bytebank.app;

import com.bytebank.app.account.BankAccount;

public class ByteBankApp {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(200);

        BankAccount account2 = new BankAccount();

        account2.setBalance(300);

        System.out.println("First account contains " + account.getBalance());
        System.out.println("Second account contains " + account2.getBalance());
        
        System.out.println(account.getBranch());
        System.out.println(account.getNumber());

        BankAccount account3 = account2;

        account3.setBalance(400);

        System.out.println("Second account contains " + account2.getBalance());
        System.out.println("Third account contains " + account3.getBalance());

        if (account2 == account3) {
            System.out.println("Second and Third account objects point to the same memory reference:");

            System.out.println("Second account: " + account2);
            System.out.println("Third account: " + account3);
        }
    }

}

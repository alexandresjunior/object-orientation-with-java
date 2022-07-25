package com.bytebank.app;

import com.bytebank.app.account.BankAccount;

public class ByteBankApp {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(200);

        BankAccount account2 = new BankAccount();

        account2.setBalance(300);

        System.out.println("First account contains " + account.getBalance());
        System.out.println("Second account contains " + account.getBalance());
        
        System.out.println(account.getBranch());
        System.out.println(account.getNumber());
    }

}

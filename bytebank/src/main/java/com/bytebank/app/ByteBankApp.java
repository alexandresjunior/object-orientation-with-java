package com.bytebank.app;

import com.bytebank.app.account.BankAccount;

public class ByteBankApp {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(200);

        System.out.println(account.getBalance());
    }

}

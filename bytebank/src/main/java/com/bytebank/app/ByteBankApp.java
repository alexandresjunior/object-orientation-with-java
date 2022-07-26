package com.bytebank.app;

import com.bytebank.app.account.BankAccount;
import com.bytebank.app.client.Client;

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

        account.deposit(100);
        account.transfer(100, account2);
        
        account2.withdraw(100);

        System.out.println("First account contains " + account.getBalance());
        System.out.println("Second account contains " + account2.getBalance());

        Client client = new Client();

        client.setName("Alexandre de Souza Jr.");

        account.setOwner(client); // Comment this line to get a NullPointerException (NPE)

        System.out.println(account.getOwner().getName());

        BankAccount account4 = new BankAccount(123, 45678);

        System.out.println(account4.getBranch());
        System.out.println(account4.getNumber());

        System.out.println(BankAccount.getNumberOfAccounts()); 
        // Note that although we created 4 accounts, it's returning only 3!
    }

}

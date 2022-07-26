package com.bytebank.app.account;

public class BankAccount {
    
    private double balance;
    private int branch;
    private int number;
    private String owner;

    public BankAccount() {
        this.branch = 42;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBranch() {
        return branch;
    }
    
    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;

            return true;
        }

        return false;        
    }

    public boolean transfer(double amount, BankAccount destinationAccount) {
        if (withdraw(amount)) {
            destinationAccount.deposit(amount);
        
            return true;
        }

        return false;
    }

}

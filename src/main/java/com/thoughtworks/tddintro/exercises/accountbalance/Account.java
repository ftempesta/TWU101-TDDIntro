package com.thoughtworks.tddintro.exercises.accountbalance;


public class Account {
    public int balance;

    public void deposit(int money) {
        balance = 100;
        balance += money;
    }

    public void decrease(int money) {
        if (balance > money){
            balance -= money;
        }
    }
}

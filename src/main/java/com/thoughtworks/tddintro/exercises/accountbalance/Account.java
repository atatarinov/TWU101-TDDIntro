package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    public int balance;

    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(int withdrawAmount) {
        if (balance - withdrawAmount >= 0) {
            balance -= withdrawAmount;
        }
    }
}

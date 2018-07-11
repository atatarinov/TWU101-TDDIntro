package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    public int balance;

    public void deposit(int depositAmount) {
        balance += depositAmount;
    }
}

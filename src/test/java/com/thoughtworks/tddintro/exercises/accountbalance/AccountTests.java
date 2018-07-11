package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {

    private Account account;
    @Before
    public void setUp() throws Exception {
        account = new Account();
        account.balance = 100;
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        account.deposit(50);
        assertThat(account.balance, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        account.withdraw(50);
        assertThat(account.balance, is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        account.withdraw(101);
        assertThat(account.balance, is(100));
    }
}

package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AccountTests {
    private Account account;
    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        account.balance = 100;
        account.deposit(50);
        assertThat(account.balance, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        account.balance = 100;
        account.decrease(50);
        assertThat(account.balance, is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        account.balance = 50;
        account.decrease(100);
        assertThat(account.balance, is(50));
    }
}

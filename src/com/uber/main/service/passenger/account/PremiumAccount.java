package com.uber.main.service.passenger.account;

public class PremiumAccount extends Account {

    public PremiumAccount(Integer userId) {
        super(userId, AccountType.PREMIUM);
    }
}

package com.uber.main.service.passenger.account;

public class StandardAccount extends Account {

    public StandardAccount(Integer userId) {
        super(userId, AccountType.STANDARD);
    }
}

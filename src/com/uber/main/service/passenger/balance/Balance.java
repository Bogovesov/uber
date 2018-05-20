package com.uber.main.service.passenger.balance;

/**
 * Current user balance
 */
public class Balance {
    private Money money;

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}

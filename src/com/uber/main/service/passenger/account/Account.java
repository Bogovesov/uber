package com.uber.main.service.passenger.account;

import com.uber.main.service.passenger.balance.Balance;
import com.uber.main.service.passenger.location.Location;
import com.uber.main.service.passenger.profile.Profile;
import com.uber.main.service.passenger.route.Route;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private Integer userId;
    private Profile profile;
    private AccountType type;
    private Bonus bonus;
    private List<Location> locationList;
    private List<Route> routeList; // saved routeList
    private Balance balance;

    protected Account(Integer userId, AccountType type) {
        this.userId = userId;
        this.type = type;
    }

    private Bonus getAccountBonusById(Integer userId) {
        if (bonus == null) {
            bonus = new Bonus();
        }
        return bonus;
    }

    private List<Location> getAccountLocationById(Integer userId) {
        if (locationList == null) {
            locationList = new ArrayList<>();
        }
        return locationList;
    }

    private Profile getProfileByUserId(Integer userId) {
        if (profile == null) {
            profile = new Profile();
        }
        return profile;
    }

    private List<Route> getAccountRoutesById(Integer userId) {
        if (routeList == null) {
            routeList = new ArrayList<>();
        }
        return routeList;
    }

    public Integer getUserId() {
        return userId;
    }

    public Profile getProfile() {
        return getProfileByUserId(userId);
    }

    public List<Location> getLocationList() {
        return getAccountLocationById(userId);
    }

    public AccountType getType() {
        return type;
    }

    public Bonus getBonus() {
        return getAccountBonusById(userId);
    }

    public List<Route> getRouteList() {
        return getAccountRoutesById(userId);
    }

    public void addLocation(Location location) {
        locationList = getLocationList();
        locationList.add(location);
    }

    public void addRoute(Route route) {
        routeList = getRouteList();
        routeList.add(route);
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

}

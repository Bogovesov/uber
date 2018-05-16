package com.uber.main.service.passenger.account;

import com.uber.main.service.passenger.location.Location;
import com.uber.main.service.passenger.profile.Profile;
import com.uber.main.service.passenger.route.Route;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Integer userId;
    private Profile profile;
    private AccountType type;
    private Bonus bonus;
    private List<Location> locationList;
    private List<Route> routeList; // saved routeList

    public Account(Integer userId) {
        this.userId = userId;
    }

    private Bonus getAccountBonusById(Integer userId) {
        if (bonus == null) {
            bonus = new Bonus();
        }
        return bonus;
    }

    private AccountType getAccountTypeById(Integer userId) {
        return AccountType.STANDARD;
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
        return getAccountTypeById(userId);
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
}

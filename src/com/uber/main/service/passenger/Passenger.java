package com.uber.main.service.passenger;

import com.uber.main.service.passenger.account.Account;
import com.uber.main.service.passenger.location.Location;
import com.uber.main.service.passenger.location.geolocation.Geolocation;
import com.uber.main.service.passenger.location.geolocation.Latitude;
import com.uber.main.service.passenger.location.geolocation.Longitude;
import com.uber.main.service.passenger.rating.Rating;
import com.uber.main.service.passenger.requirements.Requirements;
import com.uber.main.service.passenger.route.Route;
import com.uber.main.service.passenger.route.RouteHistory;

import java.util.List;

public class Passenger {
    private Integer userId;
    private Account account;
    private RouteHistory routeHistory;
    private Requirements requirements;
    private Location currentLocation;
    private Rating rating;

    public Passenger(Integer userId) {
        this.userId = userId;
        this.routeHistory = new RouteHistory(userId);
    }

    private Location getCurrentLocationById(Integer userId) {
        if (currentLocation == null) {
            currentLocation = new Location(new Geolocation(new Latitude(49.979), new Longitude(36.2472)));
        }
        return currentLocation;
    }

    public Location getCurrentLocation() {
        return getCurrentLocationById(account.getUserId());
    }

    public Account getAccount() {
        return getAccountById(userId);
    }

    private Account getAccountById(Integer userId) {
        if (account == null) {
            account = new Account(userId);
        }
        return account;
    }

    public List<Route> getRouteHistory() {
        return routeHistory.getRoutes();
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public Rating getRating() {
        return rating;
    }
}

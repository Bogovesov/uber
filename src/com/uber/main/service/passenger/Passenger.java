package com.uber.main.service.passenger;

import com.uber.main.service.passenger.account.Account;
import com.uber.main.service.passenger.account.StandardAccount;
import com.uber.main.service.passenger.balance.Money;
import com.uber.main.service.passenger.location.Location;
import com.uber.main.service.passenger.location.geolocation.Geolocation;
import com.uber.main.service.passenger.location.geolocation.Latitude;
import com.uber.main.service.passenger.location.geolocation.Longitude;
import com.uber.main.service.passenger.order.Order;
import com.uber.main.service.passenger.order.OrderImpl;
import com.uber.main.service.passenger.rating.RatingImpl;
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
    private RatingImpl rating;
    private Order order;

    public Passenger(Integer userId) {
        this.userId = userId;
        this.routeHistory = new RouteHistory(userId);
    }

    public boolean addNewOrder(Route route, Requirements requirements) {
        routeHistory.addRoute(route);
        this.requirements = requirements;
        order = new OrderImpl();
        return true;
    }

    public Money getPrice(Route route, Requirements requirements){
        return null;
    }

    private Location getCurrentLocationById(Integer userId) {
        if (currentLocation == null) {
            // coordinates take from GPS service
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
            account = new StandardAccount(userId);
        }
        return account;
    }

    public List<Route> getRouteHistory() {
        return routeHistory.getRoutes();
    }

    public Requirements getRequirements() {
        return requirements;
    }

    public RatingImpl getRating() {
        return rating;
    }
}

package com.uber.main.service.passenger.route;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RouteHistory {
    private Integer userId;
    private Map<Integer, List<Route>> routeHistory = new HashMap<>();

    public RouteHistory(Integer userId) {
        this.userId = userId;
    }

    public List<Route> getRoutes() {
        return routeHistory.get(userId);
    }

    public void addRoute(Route route) {
        if (routeHistory.containsKey(userId)) {
            var routes = routeHistory.get(userId);
            if (route == null) {
                routes = new ArrayList<>();
            }
            routes.add(route);
            routeHistory.put(userId, routes);
        }
    }
}

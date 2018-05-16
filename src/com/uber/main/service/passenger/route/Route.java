package com.uber.main.service.passenger.route;

import com.uber.main.service.passenger.location.Location;

import java.util.List;

public class Route {
    private Location startLocation;
    private List<Location> locations;

    public Route(Location startLocation, List<Location> locations) {
        this.startLocation = startLocation;
        this.locations = locations;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public List<Location> getLocations() {
        return locations;
    }
}

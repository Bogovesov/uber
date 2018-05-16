package com.uber.main.service.passenger.route;

import com.uber.main.service.passenger.location.Location;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private String date;
    private Location startLocation;
    private List<Location> locations = new ArrayList<>();

    public Route(Location startLocation, List<Location> locations) {
        this.startLocation = startLocation;
        this.locations = locations;
        this.date = CustomCurrentDate.getCurrentDate();
    }

    public Route(Location startLocation, Location finishLocation) {
        this.startLocation = startLocation;
        locations.add(finishLocation);
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public List<Location> getLocations() {
        return locations;
    }
}

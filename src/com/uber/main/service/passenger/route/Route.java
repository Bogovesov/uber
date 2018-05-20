package com.uber.main.service.passenger.route;

import com.uber.main.service.passenger.location.Location;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private String name;
    private String dateCreated; //
    private Location startLocation;
    private List<Location> locations = new ArrayList<>();

    public Route(String name, Location startLocation, List<Location> locations) {
        this.name = name;
        this.startLocation = startLocation;
        this.locations = locations;
        this.dateCreated = CustomCurrentDate.getCurrentDate();
    }

    public Route(String name, Location startLocation, Location finishLocation) {
        this.name = name;
        this.startLocation = startLocation;
        locations.add(finishLocation);
        this.dateCreated = CustomCurrentDate.getCurrentDate();
    }

    public Route(Location startLocation, List<Location> locations) {
        this(" ", startLocation, locations);
    }

    public Route(Location startLocation, Location finishLocation) {
        this("", startLocation, finishLocation);
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public String getName() {
        return name;
    }

    public String getDateCreated() {
        return dateCreated;
    }
}

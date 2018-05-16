package com.uber.main.service.passenger.location.geolocation;

public class Geolocation {
    private Latitude latitude;
    private Longitude longitude;

    public Geolocation(Latitude latitude, Longitude longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Latitude getLatitude() {
        return latitude;
    }

    public Longitude getLongitude() {
        return longitude;
    }
}

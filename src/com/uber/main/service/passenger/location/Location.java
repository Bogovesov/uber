package com.uber.main.service.passenger.location;

import com.uber.main.service.passenger.location.address.Address;
import com.uber.main.service.passenger.location.address.City;
import com.uber.main.service.passenger.location.address.State;
import com.uber.main.service.passenger.location.geolocation.Geolocation;
import com.uber.main.service.passenger.location.geolocation.Latitude;
import com.uber.main.service.passenger.location.geolocation.Longitude;

import java.util.Random;

/**
 * Location in different formats
 */
public class Location {
    private String name;
    private Address address;
    private Geolocation geolocation;

    public Location(Address address) {
        this.address = address;
        this.geolocation = getGeolocationByAddress(address);
    }

    public Location(Geolocation geolocation) {
        this.geolocation = geolocation;
        this.address = getAddressByGeolocation(geolocation);
    }

    private Address getAddressByGeolocation(Geolocation geolocation) {
        return new Address();
    }

    private Geolocation getGeolocationByAddress(Address address) {
        Random random = new Random(100);
        return new Geolocation(new Latitude(random.nextDouble()), new Longitude(random.nextDouble()));
    }

    public Address getAddress() {
        return address;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

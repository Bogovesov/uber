package com.uber.main.service.passenger.location;

import com.uber.main.service.passenger.location.address.Address;
import com.uber.main.service.passenger.location.geolocation.Geolocation;

/**
 * Current location in different formats
 */
public class Location {
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
        return null;
    }

    private Geolocation getGeolocationByAddress(Address address) {
        return null;
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
}

package com.uber.main.service.passenger.location.address;

import com.uber.main.service.passenger.location.Country;

public class Address {
    private Country country;
    private State state;
    private City city;
    private Street street;

    public Address() {
    }

    public Address(Country country, State state, City city, Street street) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public City getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public Street getStreet() {
        return street;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setStreet(Street street) {
        this.street = street;
    }
}

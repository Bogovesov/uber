package com.uber.main.service.passenger.location.geolocation;

public class Latitude {
    private Double value;

    public Latitude(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}

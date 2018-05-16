package com.uber.main.service.passenger.requirements;

public class Requirements {
    private CarType carType;

    public Requirements(CarType carType) {
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}

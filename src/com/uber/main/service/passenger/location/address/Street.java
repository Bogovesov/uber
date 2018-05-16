package com.uber.main.service.passenger.location.address;

public class Street {
    private String name;
    private HouseNumber houseNumber;

    public Street(String name, HouseNumber houseNumber) {
        this.name = name;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return name + " " + houseNumber.getNumber();
    }
}

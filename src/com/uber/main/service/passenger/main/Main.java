package com.uber.main.service.passenger.main;

import com.uber.main.service.passenger.Passenger;
import com.uber.main.service.passenger.location.Location;
import com.uber.main.service.passenger.location.geolocation.Geolocation;
import com.uber.main.service.passenger.location.geolocation.Latitude;
import com.uber.main.service.passenger.location.geolocation.Longitude;
import com.uber.main.service.passenger.profile.*;
import com.uber.main.service.passenger.route.Route;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger(1);

        passenger.getAccount().getProfile().setLastName(new Name("Bogovesov"));
        passenger.getAccount().getProfile().setFirstName(new Name("Sergey"));
        passenger.getAccount().getProfile().setEmail(new Email("bogovesov@gmail.com"));
        passenger.getAccount().getProfile().setGender(Gender.MALE);
        passenger.getAccount().getProfile().setPhoneNumber(new PhoneNumber("+380992356984"));
        passenger.getAccount().getProfile().setDescription("test");

        Location home = new Location(new Geolocation(new Latitude(10.2), new Longitude(34.4)));
        passenger.getAccount().addLocation(home);

        Location work = new Location(new Geolocation(new Latitude(16.6), new Longitude(23.6)));
        passenger.getAccount().addLocation(work);

        // trim from work to home
        passenger.getAccount().addRoute(new Route(work, home));
        passenger.getAccount().addRoute(new Route(passenger.getCurrentLocation(), home));

    }
}

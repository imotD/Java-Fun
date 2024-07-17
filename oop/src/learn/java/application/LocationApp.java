package learn.java.application;

import learn.java.data.City;
import learn.java.data.LocationAbstrack;

public class LocationApp {
    public static void main(String[] args) {
        var location = new City();
        location.name = "Pandeglang";

        System.out.printf("location name: %s%n", location.name);
    }
}

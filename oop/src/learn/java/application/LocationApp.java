package learn.java.application;

import learn.java.annotation.Fancy;
import learn.java.data.City;
import learn.java.data.LocationAbstrack;

@Fancy(name ="LocationApp", tags = {"application", "java"})
public class LocationApp {
    public static void main(String[] args) {
        var location = new City();
        location.name = "Pandeglang";

        System.out.printf("location name: %s%n", location.name);
    }
}

package learn.java.application;

import learn.java.data.Avanza;
import learn.java.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}

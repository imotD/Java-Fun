package learn.java.application;

import learn.java.data.Animal;
import learn.java.data.Cat;

public class AbstractMethodApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Miauw";
        animal.run();
    }
}

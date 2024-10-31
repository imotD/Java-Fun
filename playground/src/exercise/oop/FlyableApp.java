package exercise.oop;

public class FlyableApp {
  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.fly();

    Plane plane = new Plane();
    plane.fly();
  }
}

package exercise.oop;

public class ShapeApp {
  public static void main(String[] args) {
    Circle circle = new Circle(4);
    circle.calculateArea();

    Rectangle rectangle = new Rectangle(4, 6);
    rectangle.calculateArea();
  }
}

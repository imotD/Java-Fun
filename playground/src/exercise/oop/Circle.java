package exercise.oop;

public class Circle extends Shape{
    int r;

  public Circle(int r) {
    this.r = r;
  }

  @Override
  public void calculateArea() {
    System.out.println("Luas lingkaran : " + 3.14 * r * r);
  }
}

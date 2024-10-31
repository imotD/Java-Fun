package exercise.oop;

public class Rectangle extends Shape{
  int p;
  int l;

  public Rectangle(int p, int l) {
    this.p = p;
    this.l = l;
  }

  @Override
  public void calculateArea() {
    System.out.println("Luas Persegi Panjang : "  + p*l);
  }
}

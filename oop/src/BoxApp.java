public class BoxApp {
  public static void main(String[] args) {
   Shape shape = new Shape();
   shape.getCorner();

   Rectangle rectangle = new Rectangle();
   rectangle.getCorner();

    System.out.println(shape.getCorner());
    System.out.println(rectangle.getCorner());
    System.out.println(rectangle.getParentCorner());
  }
}

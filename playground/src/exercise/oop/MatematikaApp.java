package exercise.oop;

public class MatematikaApp {
  public static void main(String[] args) {
    Matematika matematika1 = new Matematika();
    Matematika matematika2 = new Matematika();

    System.out.println(matematika1.tambah(5,5));
    System.out.println(matematika2.tambah(10.3,2.2));
  }
}

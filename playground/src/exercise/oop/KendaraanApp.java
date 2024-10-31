package exercise.oop;

public class KendaraanApp {
  public static void main(String[] args) {
    Kendaraan kendaraan = new Kendaraan();
    kendaraan.bergerak();

    kendaraan = new Mobil();
    kendaraan.bergerak();

    kendaraan = new Perahu();
    kendaraan.bergerak();

  }
}

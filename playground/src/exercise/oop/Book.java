package exercise.oop;

public class Book {
  String judul;
  String penulis;
  Boolean isAvailable;

  public Book(String judul, String penulis, Boolean isAvailable) {
    this.judul = judul;
    this.penulis = penulis;
    this.isAvailable = isAvailable;
  }

  public void displayInfo(){
    String hasAvailable = this.isAvailable ? "Tersedia" : "Tidak tersedia";
    System.out.println("==================");
    System.out.println("Judul : " + this.judul + "\n" +"Penulis : " + this.penulis + "\n" + "Status : " + hasAvailable );
    System.out.println("==================");
  }

  public void borrowBook(){
    this.isAvailable = false;
    String hasAvailable = this.isAvailable ? "Tersedia" : "Tidak tersedia";

    System.out.println("Meminjam buku...");
    System.out.println("Status: " + hasAvailable);

    displayInfo();
  }

  public void returnBook(){
    isAvailable = true;
    String hasAvailable = this.isAvailable ? "Tersedia" : "Tidak tersedia";

    System.out.println("Mengembalikan buku...");
    System.out.println("Status: " + hasAvailable);

    displayInfo();  }
}

package exercise.oop;

public class BookApp {
  public static void main(String[] args) {
    Book book = new Book("Pemograman Web", "Tommy Alhamra", true);
    book.displayInfo();
    book.borrowBook();
    book.returnBook();}
}

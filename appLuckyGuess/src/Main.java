import java.util.Random;
import java.util.Scanner;

public class Main {

  static Random random = new Random();
  static Scanner scanner = new Scanner(System.in);

  static int luckyGuessNumber = random.nextInt(100) + 1;

  public static void main(String[] args) {
    showLuckyGuess();
  }

  //  Menampilkan Menu
  public static void showLuckyGuess() {
    while (true) {

      System.out.println("## Lucky Guess\n" +
              "Permainan Tebak Angka dari  1 - 100\n");

      System.out.println("1. Main");
      System.out.println("x. Keluar");

      var input = input("Pilih");

      if (input.equals("1")) {
        viewAddLuckyGuess();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("==> Pilih sesuai menu\n");
      }
    }


  }

  public static void testShowLuckyGuess() {
    showLuckyGuess();
  }

  // Tebak Angka
  public static boolean addLuckyGuess(Integer myLuckyGuess) {
    return myLuckyGuess == luckyGuessNumber;
  }

  public static void testAddLuckyGuess(Integer myLuckyGuess) {
    addLuckyGuess(myLuckyGuess);
  }

  public static String input(String info) {
    System.out.println(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

  public static void testInput() {
    var name = input("Nama");
    System.out.println("Hi " + name);

    var channel = input("Keluar");
    System.out.println(channel);
  }

  // Menampilkan Tebak Angka
  public static void viewAddLuckyGuess() {
    System.out.println("## SILAHKAN TEBAK");

    while (true) {
      var inputan = input("tekan x jika nyerah");
      if (inputan.equals("x")) {
        break;
      }

      try {
        Integer geuss = Integer.valueOf(inputan);
        if (addLuckyGuess(geuss)) {
          System.out.println("Wah Betul dong !!. Kamu hebat 👍");
          break;

        } else {
          System.out.println("Tetot ❌! " + "Coba tebak lagi..");
        }
      } catch (NumberFormatException e) {
        System.out.println("Input tidak valid. Masukkan angka atau 'x' untuk menyerah.");
      }
    }

  }

  public static void testViewAddLuckyGuess() {
    viewAddLuckyGuess();
  }
}
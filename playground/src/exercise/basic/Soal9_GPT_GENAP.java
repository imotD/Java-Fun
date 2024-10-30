package exercise.basic;

import java.util.Scanner;

public class Soal9_GPT_GENAP {
  public static void main(String[] args) {
    //Soal 9: Menentukan Bilangan Genap atau Ganjil
    Scanner sc = new Scanner(System.in);
    int angka;

    System.out.println("Masukan angka :");
    angka = sc.nextInt();

    if(angka % 2 == 0){
      System.out.println("Angka " + angka + " adalah genap");
    }


  }
}

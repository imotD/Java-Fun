import java.util.Scanner;

public class Soal10_GPT_KonversiSuhu {

  static double conversSuhu(double i) {
    return (9.0 / 5) * i + 32;
  }


  public static void main(String[] args) {
    //Soal 10: Konversi Suhu

    Scanner sc = new Scanner(System.in);
    double angka;

    System.out.println("Masukkan suhu dalam Celsius :");
    angka = sc.nextInt();

    var result = conversSuhu(angka);


    System.out.println(result);




  }
}

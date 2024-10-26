import java.util.Scanner;

public class Soal7_GPT_DOWHILE {
  public static void main(String[] args) {
    //Soal 7: Menggunakan do-while
    Scanner sc = new Scanner(System.in);
    int angka;

    do{
      System.out.println("Masukan angka :");
      angka = sc.nextInt();

      if(angka > 0){
        System.out.println("Angka Positif : " + angka);
      }
    }while(angka < 0);


  }
}

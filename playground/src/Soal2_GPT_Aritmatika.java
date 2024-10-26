public class Soal2_GPT_Aritmatika {

   static int penjumlahan (int a, int b){
    return a + b;
  }

  static int pengurangan (int a, int b){
    return a - b;
  }

  static int perkalian (int a, int b){
    return a * b;
  }

  static int pembagian (int a, int b){
    return a / b;
  }



  public static void main(String[] args) {
    int tambah = penjumlahan(25,5);
    int kurang = pengurangan(15,5);
    int kali  = perkalian(100,2);
    int bagi = pembagian(10,2);

    System.out.println("Penjumlahan: " + tambah);
    System.out.println("Pengurangan: " + kurang);
    System.out.println("Perkalian: " + kali);
    System.out.println("Pembagian: " + bagi);

  }
}
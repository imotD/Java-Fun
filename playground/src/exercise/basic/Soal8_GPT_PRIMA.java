package exercise.basic;

public class Soal8_GPT_PRIMA {

  static boolean isPrime(int n) {
    if(n == 1 || n == 0) return false;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    //Soal 8: Kombinasi Kondisi dan Perulangan
    int n = 50;

    for (int i = 1; i <= n; i++) {
      if(isPrime(i)) {
        System.out.println(i);
      }
    }
  }
}

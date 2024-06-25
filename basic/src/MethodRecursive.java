public class MethodRecursive {
  public static void main(String[] args) {
    int hasilFaktorial = hitungFaktorial(3);
    System.out.println("Faktorial 3 adalah: " + hasilFaktorial);
  }

  public static int hitungFaktorial(int n) {
    if (n == 0) { // Base case: faktorial 0 = 1
      return 1;
    } else {
      return n * hitungFaktorial(n - 1); // Pemanggilan rekursif
    }
  }
}
package my.learn.classes;

public class NumberApp {
  public static void main(String[] args) {

    Integer intValue = 10;

    Long longValue = intValue.longValue();
    Double doubelValue = longValue.doubleValue();
    Short shortValue = doubelValue.shortValue();

    String contoh = "100.10";
    Double contohInt = Double.valueOf(contoh);
    System.out.println(contohInt);
  }
}

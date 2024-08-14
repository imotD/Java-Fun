package learn.java.generic.application;

import learn.java.generic.Pair;

public class PairApp {
  public static void main(String[] args) {

    Pair<String, Integer> pair1 = new Pair<>("a", 1);

    String stringValue1 = pair1.getFirst();
    Integer integerValue1 = pair1.getSecond();

    System.out.println(stringValue1);
    System.out.println(integerValue1);

  }
}

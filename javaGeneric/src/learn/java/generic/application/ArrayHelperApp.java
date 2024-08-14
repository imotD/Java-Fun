package learn.java.generic.application;

import learn.java.generic.utils.ArrayHelper;

public class ArrayHelperApp {
  public static void main(String[] args) {

    String[] names = {"Eko", "Kurniawan", "Alhamra"};
    Integer[] numbers = {1, 2, 3};

    System.out.println(
            ArrayHelper.<String>count(names)
    );

    System.out.println(ArrayHelper.count(numbers));
  }
}

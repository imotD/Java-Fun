package learn.java.generic.application;

import learn.java.generic.MyData;

public class GenericClassApp {
  public static void main(String[] args) {
    MyData<String> stringData = new MyData<>("Eko");
    MyData<Integer> stringIntegerData = new MyData<>(100);

    String stringValue = stringData.getData();
    Integer stringIntegerValue = stringIntegerData.getData();

    System.out.println(stringValue);
    System.out.println(stringIntegerValue);

//    System.out.println(stringData.getData());
//    System.out.println(stringIntegerData.getData());

  }
}

package learn.java.generic.application;

import learn.java.generic.MyData;

public class WildCardApp {
  public static void main(String[] args) {

    // Tidak peduli tipe apapun yang penting print

    print(new MyData<Integer>(100));
    print(new MyData<String>("Hello World"));

  }

  public static void print(MyData<?> myData){
    System.out.println(myData.getData());
  }
}

package learn.java.generic.application;

import learn.java.generic.MyData;

public class ContravariantApp {

  public static void main(String[] args) {
    // contravariant bisa read dan write
    // parent => child
    // untuk write disarankan namun untuk read perlu perlakuan khusus
    // pake key "super"

    MyData<Object> stringData = new MyData<>("Tommy");
    MyData<? super String> myData = stringData;

    process(stringData);

    System.out.println(stringData.getData());

  }

  public static void process(MyData<? super String> myData) {
    Object value = myData.getData();
    System.out.println("Processing parameter " + value);

    myData.setData("Tommy Contravariant");
  }
}

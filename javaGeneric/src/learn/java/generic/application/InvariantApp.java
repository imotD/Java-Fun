package learn.java.generic.application;

import learn.java.generic.MyData;

public class InvariantApp {
  public static void main(String[] args) {

//    Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)

    MyData<String> stringMyData = new MyData<>("Eko");
//    doIt(stringMyData); ERROR
//    MyData<Object> objctMyData = stringMyData; ERROR

  }

  public static void doIt(MyData<Object> stringMyData) {

  }
}

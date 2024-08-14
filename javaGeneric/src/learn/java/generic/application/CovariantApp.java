package learn.java.generic.application;

import learn.java.generic.MyData;

public class CovariantApp {
  public static void main(String[] args) {

    // Covariant hanya readyonly
    // child -> parent
    // tidak bisa write
    // pake key "Ekstend"

    MyData<String> stringMyData = new MyData<>("Tommy");
    process(stringMyData);

  }

  public static void process(MyData<? extends Object> myData){

    System.out.println(myData.getData());
//    myData.setData(1);
  }
}

package learn.java.application;

import learn.java.data.AnonHello;

public class AnonHelloApp {
  public static void main(String[] args) {

    //tidak bisa di reusable
    AnonHello english = new AnonHello() {

      public void sayHello() {
        System.out.println("Hello");
      }

      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    english.sayHello();
    english.sayHello("John");
  }
}

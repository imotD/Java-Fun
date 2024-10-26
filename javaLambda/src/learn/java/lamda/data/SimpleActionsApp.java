package learn.java.lamda.data;

import learn.java.lamda.SimpleActions;

public class SimpleActionsApp {

  public static void main(String[] args) {

    SimpleActions simpleActions1 = new SimpleActions(){
      public String action() {
        return "tommy";
      }
    };

    System.out.println(simpleActions1);

    SimpleActions simpleActions2 = (String name) -> {
      return "tommy 2";
    };

    System.out.println(simpleActions2);

  }
}

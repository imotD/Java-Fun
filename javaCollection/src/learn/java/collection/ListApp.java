package learn.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
//    List<String> list = new LinkedList<>();

    list.add("A");
    list.add("B");

    list.set(0, "C");
    list.remove(1);
    System.out.println(list.get(0));

    for( var value : list){
      System.out.println(value);
    }
  }
}

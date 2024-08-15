package learn.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("A");
    collection.add("B");
    collection.add("C");
    collection.addAll(List.of("D", "E", "F"));

    for(var value : collection) {
      System.out.println(value);
    }

    System.out.println("REMOVE");
    collection.remove("B");
    collection.remove("D");
    collection.remove("E");

    for(var value : collection) {
      System.out.println(value);
    }

    System.out.println(collection.contains('A'));

  }
}

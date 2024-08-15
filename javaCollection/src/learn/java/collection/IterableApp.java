package learn.java.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {

  public static void main(String[] args) {
    Iterable<String> names = List.of("Tommy", "Arab", "Kadri");

    for (var name : names){
      System.out.println(name);
    }

    System.out.println("INTERATOR");
    Iterator<String> iterator = names.iterator();

    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}

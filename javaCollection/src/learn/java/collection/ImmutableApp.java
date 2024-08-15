package learn.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {

    List<String> one = Collections.singletonList("Satu");
    List<String> empty = Collections.emptyList();

    List<String> mutable = new ArrayList<>();
    mutable.add("Satu");
    mutable.add("dua");
    List<String> immutable = Collections.unmodifiableList(one);

    List<String> elements = List.of("Tommy", "Alhamra", "Akagami");

  }
}

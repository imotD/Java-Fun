package my.learn.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
  public static void main(String[] args) {
    StringJoiner stringJoiner = new StringJoiner("-","[","]");
    stringJoiner.add("Tommy");
    stringJoiner.add("Jack");
    System.out.println(stringJoiner.toString());
  }
}

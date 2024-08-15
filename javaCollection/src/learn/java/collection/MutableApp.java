package learn.java.collection;

import learn.java.collection.data.Person;

import java.util.List;

public class MutableApp {
  public static void main(String[] args) {

    Person person = new Person("tommy");
    person.addHobby("Game");
    person.addHobby("Coding");

    doSomethingWithHobbies(person.getHobbies());

    for(var hobbies : person.getHobbies()) {
      System.out.println(hobbies);
    }
  }

  public static void doSomethingWithHobbies(List<String> hobbies) {
    hobbies.add("Hack");
  }
}

package exercise.oop;

public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String display(){
    return "Name: " + name + "\n" + "Age: " + age;
  }
}

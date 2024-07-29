package my.learn.classes;

public class StringApp {
  public static void main(String[] args) {
    String name = "Tommy Alhamra";
    String nameToLowerCase = name.toLowerCase();
    String nameToUpperCase = name.toUpperCase();

    System.out.println(nameToUpperCase);
    System.out.println(nameToLowerCase);
    System.out.println(name.length());
    System.out.println(name.startsWith("Tommy"));
    System.out.println(name.endsWith("Alhamra"));

    System.out.println("".isBlank());
    System.out.println("".isEmpty());
  }
}

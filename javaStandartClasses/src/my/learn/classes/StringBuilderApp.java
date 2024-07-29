package my.learn.classes;

public class StringBuilderApp {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Tommy");
    stringBuilder.append(" ");
    stringBuilder.append("Alhamra");
    stringBuilder.append(" ");
    stringBuilder.append("Kiana");

    String fullString = stringBuilder.toString();
    System.out.println(fullString);
  }
}

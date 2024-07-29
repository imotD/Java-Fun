package my.learn.classes;

import java.util.Base64;

public class Base64App {
  public static void main(String[] args) {
    String original = "Tommy Alhamra";
    String encode = Base64.getEncoder().encodeToString(original.getBytes());
    System.out.println(encode);

    byte[] decode = Base64.getDecoder().decode(encode);
    String decoded = new String(decode);
    System.out.println(decoded);
  }
}

package learn.java.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Tom";
        first = first + " " + "Alhamra";

        System.out.println(first);

        String second = "Tom Alhamra";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String thrid = "Tom Alhamra";

        System.out.println(second == thrid);
        System.out.println(second.equals(thrid));

    }
}

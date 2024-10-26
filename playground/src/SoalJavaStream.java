import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SoalJavaStream {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
    List<Integer> evenNumbers = numbers.stream()
                    .filter(f -> f % 2 == 0)
                    .map(m -> m * 4)
                    .collect(Collectors.toList());


    System.out.println("Angka genap yang dikalikan 2: " + evenNumbers);
  }
}

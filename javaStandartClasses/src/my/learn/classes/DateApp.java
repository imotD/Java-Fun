package my.learn.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
  public static void main(String[] args) {
    Date tanggal = new Date();
    System.out.println(tanggal);

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 1993);

    Date result = calendar.getTime();
    System.out.println(result);
  }
}

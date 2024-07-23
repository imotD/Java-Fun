package learn.java.application;

import learn.java.data.Application;
import static learn.java.data.Constant.*;
import learn.java.data.Country;
import learn.java.data.MathUtil;

public class StaticApp {
  public static void main(String[] args) {

    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(MathUtil.sum(2,2,2,2));

    Country.City city = new Country.City();
    city.setName("Subang");

    System.out.println(city.getName());
    System.out.println(Application.PROCESSORS);

  }
}

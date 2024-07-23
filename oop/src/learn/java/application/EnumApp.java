package learn.java.application;

import learn.java.data.Customer;
import learn.java.data.Level;

public class EnumApp {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Tommy");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel().getDescription());
  }
}

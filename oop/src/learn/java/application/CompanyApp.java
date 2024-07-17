package learn.java.application;

import learn.java.data.Company;

public class CompanyApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Tommy");

    Company.Employee employee = company.new Employee();
    employee.setName("Jack");

    System.out.println(employee.getName());
    System.out.println(employee.getCompany());

  }
}

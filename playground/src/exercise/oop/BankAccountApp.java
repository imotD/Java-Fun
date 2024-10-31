package exercise.oop;

public class BankAccountApp {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.setAccountNumber("1111222333");
    account.setBalance(1000);

    account.deposit(500);
    account.getBalance();

    account.deposit(600);
    account.getBalance();

    account.withdraw(1000);
    account.getBalance();

  }
}

package exercise.oop;

public class BankAccount {
  String accountNumber;
  double balance;

  public void deposit(double amount) {
     balance += amount;
    System.out.println("Deposited " + amount + " to " + accountNumber);
  }

  public void withdraw(double amount) {
     balance -= amount;
    System.out.println("Withdrawn " + amount + " from " + accountNumber);
  }

  public String getAccountNumber() {
    System.out.println("Account Number: " + accountNumber);
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    System.out.println("Balance: " + balance);
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
    System.out.println("Saldo atual: " + balance);
  }
}

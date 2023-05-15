package org.example.command;

public class BankAccount extends Client {
  private int balance;
  private int overdraftLimit = -1000;

  public void deposit(int amount){
    balance += amount;
  }

  public void withdraw(int amount){
    if( balance-amount < overdraftLimit){
      System.out.println("Insufficient funds");
    } else {
      balance -= amount;
    }
  }

  @Override
  public String toString() {
    return "BankAccount{" +
        "balance=" + balance +
        '}';
  }
}

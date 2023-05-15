package org.example.command;


import java.util.List;

public class Client {

  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    System.out.println(bankAccount);
    ATM atm = new ATM();

    List<Command> commands = List.of(
        new BankAccountCommand(bankAccount, Action.DEPOSIT, 100),
        new  BankAccountCommand(bankAccount, Action.WITHDRAW, 2000)
    );

    for (Command c: commands)
    {
      atm.setCommand(c);
      atm.executeCommand();
      System.out.println(bankAccount);
    }
  }

}

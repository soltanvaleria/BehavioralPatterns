package org.example.command;

public class ATM {
  private Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void executeCommand(){
    command.execute();
  }

}

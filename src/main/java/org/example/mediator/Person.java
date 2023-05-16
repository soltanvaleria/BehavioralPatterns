package org.example.mediator;

public class Person {
  public String name;
  public ChatRoom room;

  public Person(String name) {
    this.name = name;
  }
  public void receive(String sender, String message)
  {
    String s = sender + ": '" + message + "'";
    System.out.println("[" + name + "'s chat session] " + s);
  }

  public void say(String message)
  {
    room.broadcast(name, message);
  }

  public void privateMessage(String who, String message)
  {
    room.message(name, who, message);
  }
}

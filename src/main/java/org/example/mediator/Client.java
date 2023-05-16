package org.example.mediator;

public class Client {

  public static void main(String[] args) {
    ChatRoom room = new ChatRoom();

    Person ion = new Person("Ion");
    Person cris = new Person("Cris");

    room.join(ion); // no message here
    room.join(cris);

    ion.say("hi room");
    cris.say("hey ion");

    Person simon = new Person("Simon");
    room.join(simon);
    simon.say("hi everyone!");

    cris.privateMessage("Simon", "glad you could join us!");
  }

}

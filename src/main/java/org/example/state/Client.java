package org.example.state;

public class Client {

  public static void main(String[] args) {

    LightSwitch lightSwitch = new LightSwitch();
    lightSwitch.on();
    lightSwitch.on();
    lightSwitch.off();
  }

}

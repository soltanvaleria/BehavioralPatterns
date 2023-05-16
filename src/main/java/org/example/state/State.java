package org.example.state;

public class State {

  void on(LightSwitch ls)
  {
    System.out.println("Light already on");
  }
  void off(LightSwitch ls)
  {
    System.out.println("Light already off");
  }

}

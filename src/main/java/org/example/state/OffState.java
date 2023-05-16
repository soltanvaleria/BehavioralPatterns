package org.example.state;

public class OffState extends State{

  public OffState() {
    System.out.println("Light is off");
  }

  @Override
  void on(LightSwitch ls) {
    System.out.println("....Switching on the light");
    ls.setState(new OnState());
  }

}
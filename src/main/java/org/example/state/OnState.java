package org.example.state;

public class OnState extends State{

  public OnState() {
    System.out.println("Light turned ON");
  }

  @Override
  void off(LightSwitch ls) {
    System.out.println("....Switching light OFF");
    ls.setState(new OffState());
  }
}
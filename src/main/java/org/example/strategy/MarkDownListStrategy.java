package org.example.strategy;

public class MarkDownListStrategy implements ListStrategy{

  @Override
  public void start(StringBuilder sb) {

  }

  @Override
  public void addListItem(StringBuilder sb, String item) {
    sb.append(" * ").append(item).append(System.lineSeparator());
  }

  @Override
  public void end(StringBuilder sb) {

  }
}

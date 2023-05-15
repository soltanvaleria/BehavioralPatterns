package org.example.strategy;

public interface ListStrategy {
  void start(StringBuilder sb);
  void addListItem(StringBuilder sb, String item);
  void end(StringBuilder sb);

}

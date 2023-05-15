package org.example.visitor;

public abstract class Expression {
  public abstract void accept(ExpressionVisitor visitor);

}

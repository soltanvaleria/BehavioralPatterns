package org.example.visitor;

public class ExpressionCalculatorVisitor implements ExpressionVisitor{

  public double result;
  @Override
  public void visit(DoubleExpression e) {
    result = e.value;
  }

  @Override
  public void visit(AdditionExpression e) {
    e.left.accept(this);
    double a = result;
    e.right.accept(this);
    double b = result;
    result = a+b;
  }
}

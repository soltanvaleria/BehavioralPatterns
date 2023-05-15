package org.example.visitor;

public class ExpressionPrinterVisitor implements ExpressionVisitor{

  private StringBuilder stringBuilder = new StringBuilder();
  @Override
  public void visit(DoubleExpression e) {
    stringBuilder.append(e.value);
  }

  @Override
  public void visit(AdditionExpression e) {
    stringBuilder.append("(");
    e.left.accept(this);
    stringBuilder.append("+");
    e.right.accept(this);
    stringBuilder.append(")");
  }

  @Override
  public String toString() {
    return stringBuilder.toString();
  }
}

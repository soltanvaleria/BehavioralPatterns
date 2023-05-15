package org.example.visitor;

public interface ExpressionVisitor {

  void visit(DoubleExpression e);
  void visit(AdditionExpression e);
}

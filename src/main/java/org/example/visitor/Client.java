package org.example.visitor;

public class Client {

  public static void main(String[] args) {
    AdditionExpression e = new AdditionExpression(
        new DoubleExpression(9),
        new AdditionExpression(
            new DoubleExpression(10),
            new DoubleExpression(3)
        ));
    ExpressionPrinterVisitor epv = new ExpressionPrinterVisitor();
    epv.visit(e);

    ExpressionCalculatorVisitor calc = new ExpressionCalculatorVisitor();
    calc.visit(e);
    System.out.println(epv + " = " + calc.result);
  }
}

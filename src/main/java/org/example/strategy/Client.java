package org.example.strategy;

import java.util.List;

public class Client {

  public static void main(String[] args) {
    TextProcessor textProcessor = new TextProcessor(OutputFormat.MARKDOWN);
    textProcessor.appendList(List.of("salut", "da", "bine", "pa"));
    System.out.println(textProcessor);

    textProcessor.clear();
    textProcessor.setOutputFormat(OutputFormat.HTML);
    textProcessor.appendList(List.of("OOP", "Solid"));
    System.out.println(textProcessor);
  }

}

package structural.decorator.components;

import structural.decorator.Logger;

public class ConsoleLogger implements Logger {
  public void log(String msg) {
    System.out.println("Logging to console! " + msg);
  }
}

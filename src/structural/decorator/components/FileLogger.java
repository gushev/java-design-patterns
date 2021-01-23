package structural.decorator.components;

import structural.decorator.Logger;

public class FileLogger implements Logger {
  public void log(String msg) {
    System.out.println("Logging to file! " + msg);
  }
}

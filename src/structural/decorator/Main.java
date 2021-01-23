package structural.decorator;

import structural.decorator.decorators.EncryptLogger;
import structural.decorator.decorators.HtmlLogger;

public class Main {
  public static void main(String[] args) {
    LoggerFactory factory = new LoggerFactory();
    Logger logger = factory.getLogger(LoggerFactory.TYPE_CONSOLE_LOGGER);
    Logger fileLogger = factory.getLogger(LoggerFactory.TYPE_FILE_LOGGER);

    Logger htmlLogger = new HtmlLogger(logger);
    htmlLogger.log("A message to log");

    Logger encryptLogger = new EncryptLogger(fileLogger);
    encryptLogger.log("A message to log");
  }
}

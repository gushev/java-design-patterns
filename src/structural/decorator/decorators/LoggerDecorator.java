package structural.decorator.decorators;

import structural.decorator.Logger;

public class LoggerDecorator implements Logger {
  Logger logger;

  public LoggerDecorator(Logger logger) {
    this.logger = logger;
  }

  public void log(String msg) {
    logger.log(msg);
  }
}

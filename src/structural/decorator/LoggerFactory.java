package structural.decorator;

import structural.decorator.components.ConsoleLogger;
import structural.decorator.components.FileLogger;

public class LoggerFactory {
  public static final String TYPE_CONSOLE_LOGGER = "console";
  public static final String TYPE_FILE_LOGGER = "file";

  public Logger getLogger(String type) {
    switch (type) {
      case TYPE_FILE_LOGGER: {
        return new FileLogger();
      }
      default: {
        return new ConsoleLogger();
      }
    }
  }
}

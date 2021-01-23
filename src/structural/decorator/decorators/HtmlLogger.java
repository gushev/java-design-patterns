package structural.decorator.decorators;

import structural.decorator.Logger;

public class HtmlLogger extends LoggerDecorator {
  public HtmlLogger(Logger logger) {
    super(logger);
  }

  public void log(String msg) {
    msg = makeHTML(msg);
    logger.log(msg);
  }

  private String makeHTML(String msg) {
    msg = "<html><body>" + "<b>" + msg + "</b>" +
      "</body></html>";
    return msg;
  }
}

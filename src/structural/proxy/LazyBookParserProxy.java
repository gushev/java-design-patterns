package structural.proxy;

class LazyBookParserProxy implements BookParser {
  private BookParser bookParser = null;
  private String author;
  private String content;

  public LazyBookParserProxy(String author, String content) {
    this.author = author;
    this.content = content;
  }

  public String getAuthor() {
    return author;
  }

  private BookParser getBookParser() {
    if (bookParser == null) {
      bookParser = new BookParserImpl(author, content);
    }

    return bookParser;
  }

  public int getNumPages() {
    return getBookParser().getNumPages();
  }

  public int getNumWords() {
    return getBookParser().getNumWords();
  }
}

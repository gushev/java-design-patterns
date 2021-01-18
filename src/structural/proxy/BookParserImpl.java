package structural.proxy;

class BookParserImpl implements BookParser {
  private String author;
  private String content;
  int numPages;
  int numWords;

  public BookParserImpl(String author, String content) {
    this.author = author;
    this.content = content;
    heavyBookCalculation();
  }

  private void heavyBookCalculation() {
    // this is where the heavy calculation takes place
    // and we want to avoid initially
    System.out.println("VERY HEAVY COMPUTATION TAKING PLACE");
    numPages = 1;
    numWords = 2;
  }

  public String getAuthor() {
    return author;
  }

  public int getNumPages() {
    return numPages;
  }

  public int getNumWords() {
    return numWords;
  }
}

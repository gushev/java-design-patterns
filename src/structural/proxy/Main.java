package structural.proxy;

public class Main {
  public static void main(String[] args) {
    String author = "J. K. Rowling";
    String content = "Harry Potter and the Ships from Black Sea";


    BookParser bookParserProxy = new LazyBookParserProxy(author, content);
    System.out.println("Book Parser Proxy instantiated");

    System.out.println("The book author is: " + bookParserProxy.getAuthor());

    System.out.println("The book contains " + bookParserProxy.getNumPages() + " pages");

    System.out.println("The book contains " + bookParserProxy.getNumWords() + " words");
  }
}

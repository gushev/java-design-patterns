package creational.prototype;

public class Main {
  public static void main(String[] args) {
    PrototypeManager manager = new PrototypeManager();

    System.out.println(manager.get("concrete"));
    System.out.println(manager.get("concrete"));
    System.out.println(manager.get("nested"));
    System.out.println(manager.get("nested"));
  }
}

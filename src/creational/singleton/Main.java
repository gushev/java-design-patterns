package creational.singleton;

public class Main {
  public static void main(String[] args) {
    SingleObject instance = SingleObject.getInstance("Some Instance");
    SingleObject anotherInstance = SingleObject.getInstance("Another instance");

    System.out.println(instance.getValue());
    System.out.println(anotherInstance.getValue());
  }
}

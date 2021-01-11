package creational.abstractfactory;

import creational.abstractfactory.factories.ConcreteFactory1;
import creational.abstractfactory.factories.ConcreteFactory2;

public class Main {
  public static void main(String[] args) {
    Client client1 = new Client(new ConcreteFactory1());
    Client client2 = new Client(new ConcreteFactory2());

    client1.callAllProductOperations();
    client2.callAllProductOperations();
  }
}

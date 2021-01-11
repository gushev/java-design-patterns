package behavioral.observer;

import behavioral.observer.observers.BinaryObserver;
import behavioral.observer.observers.HexObserver;
import behavioral.observer.observers.OctalObserver;
import behavioral.observer.subjects.ConcreteSubject;
import behavioral.observer.subjects.Subject;

public class Main {
  public static void main(String[] args) {
    Subject subject = new ConcreteSubject();

    new HexObserver(subject);
    new OctalObserver(subject);
    new BinaryObserver(subject);

    System.out.println("First state change: 15");
    subject.setState(15);
    System.out.println("Second state change: 10");
    subject.setState(10);
  }
}

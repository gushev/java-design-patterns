package behavioral.observer.subjects;

import behavioral.observer.observers.Observer;

public interface Subject {
  void attach(Observer observer);

  void notifyAllObservers();

  int getState();

  void setState(int state);
}

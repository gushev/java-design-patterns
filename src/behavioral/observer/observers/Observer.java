package behavioral.observer.observers;

import behavioral.observer.subjects.Subject;

public abstract class Observer {
  protected Subject subject;

  public abstract void update();
}

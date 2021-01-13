package creational.singleton;

public class SingleObject {
  private static SingleObject instance;
  private String value;

  private SingleObject(String value){
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static SingleObject getInstance(String value) {
    if (instance == null) {
      instance = new SingleObject(value);
    }

    return instance;
  }
}

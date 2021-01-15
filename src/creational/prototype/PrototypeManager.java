package creational.prototype;

import creational.prototype.prototypes.ConcretePrototype;
import creational.prototype.prototypes.NestedPrototype;
import creational.prototype.prototypes.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
  private Map<String, Prototype> prototypes = new HashMap<>();

  public PrototypeManager() {
    ConcretePrototype prototype = new ConcretePrototype();
    NestedPrototype nestedPrototype = new NestedPrototype();

    nestedPrototype.setPropertyOne("Some value - nested");
    nestedPrototype.setPropertyTwo(123);

    prototype.setPropertyOne("Some value - concrete");
    prototype.setPropertyTwo(321);
    prototype.setNestedPrototype(nestedPrototype);

    prototypes.put("concrete", prototype);
    prototypes.put("nested", nestedPrototype);
  }

  public Prototype get(String key) {
    return prototypes.get(key).clone();
  }

  public void put(String key, Prototype prototype) {
    prototypes.put(key, prototype);
  }
}

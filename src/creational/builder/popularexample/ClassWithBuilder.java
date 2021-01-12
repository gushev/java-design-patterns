package creational.builder.popularexample;

public class ClassWithBuilder {

  private final String propertyOne;
  private final Integer propertyTwo;

  private ClassWithBuilder(Builder builder) {
    propertyOne = builder.getPropertyOne();
    propertyTwo = builder.getPropertyTwo();
  }

  public String getPropertyOne() {
    return propertyOne;
  }

  public Integer getPropertyTwo() {
    return propertyTwo;
  }

  public static Builder builder() {
    return new Builder();
  }

  static class Builder {
    private String propertyOne;
    private Integer propertyTwo;

    public String getPropertyOne() {
      return propertyOne;
    }

    public Builder propertyOne(String propertyOne) {
      this.propertyOne = propertyOne;
      return this;
    }

    public Integer getPropertyTwo() {
      return propertyTwo;
    }

    public Builder propertyTwo(Integer propertyTwo) {
      this.propertyTwo = propertyTwo;
      return this;
    }

    public ClassWithBuilder build() {
      return new ClassWithBuilder(this);
    }
  }
}

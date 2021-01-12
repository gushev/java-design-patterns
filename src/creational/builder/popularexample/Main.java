package creational.builder.popularexample;

public class Main {
  public static void main(String[] args) {
    ClassWithBuilder classWithBuilder =
        ClassWithBuilder.builder().propertyOne("String").propertyTwo(123).build();

    System.out.println(classWithBuilder.getPropertyOne());
    System.out.println(classWithBuilder.getPropertyTwo());
  }
}

package designPatterns.bridge;

public class Plastic implements Material{
  @Override
  public void getDescription() {
    System.out.println("Plastic is fantastic.");
  }

  @Override
  public int getPrice() {
    return 30;
  }
}

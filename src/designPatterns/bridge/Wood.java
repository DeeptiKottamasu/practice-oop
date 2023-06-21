package designPatterns.bridge;

public class Wood implements Material{
  @Override
  public void getDescription() {
    System.out.println("Wood is good.");
  }

  @Override
  public int getPrice() {
    return 110;
  }
}

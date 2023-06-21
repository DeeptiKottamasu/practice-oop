package designPatterns.decorator;

public class ChocolateCake implements Cake{
  @Override
  public void getDescription() {
    System.out.println("Yayyy chocolate cake");
  }

  @Override
  public int getPrice() {
    return 220;
  }
}

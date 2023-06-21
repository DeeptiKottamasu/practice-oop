package designPatterns.decorator;

public class VanillaCake implements Cake{
  @Override
  public void getDescription() {
    System.out.println("This is a vanilla cake.. yumm");

  }

  @Override
  public int getPrice() {
    return 100;
  }
}

package designPatterns.decorator;

public class Sprinkles implements Cake{
  Cake cake;
  Sprinkles(Cake cake){
    this.cake = cake;
  }

  @Override
  public void getDescription() {
    cake.getDescription();
    System.out.println("Sprinkles make it even better :3");
  }

  @Override
  public int getPrice() {
    return 12 + cake.getPrice();
  }
}

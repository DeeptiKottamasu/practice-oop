package designPatterns.decorator;

public class Fruits implements Cake{
  Cake cake;
  Fruits(Cake cake){
    this.cake = cake;
  }

  @Override
  public void getDescription() {
    cake.getDescription();
    System.out.println("fruits are healthy :3");
  }

  @Override
  public int getPrice() {
    return 82 + cake.getPrice();
  }
}

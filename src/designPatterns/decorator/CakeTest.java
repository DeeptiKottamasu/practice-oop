package designPatterns.decorator;

public class CakeTest {
  public static void main(String args[]){
    Cake chocolateCake = new ChocolateCake();
    chocolateCake.getDescription();
    System.out.println(chocolateCake.getPrice());

    Cake sprinklesChocolateCake = new Sprinkles(chocolateCake);
    sprinklesChocolateCake.getDescription();
    System.out.println(sprinklesChocolateCake.getPrice());
  }
}

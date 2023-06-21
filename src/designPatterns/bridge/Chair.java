package designPatterns.bridge;

public class Chair implements Furniture{
  int legs = 4;
  int size =2;
  Material material;
  Chair(Material material){
    this.material = material;
  }
  @Override
  public void getDescription(){
    System.out.println("This is a chair");
    material.getDescription();
  }
  @Override
  public void getQuote(){
    System.out.println("Cost is " + 1000 + material.getPrice());
  }
}

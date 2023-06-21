package designPatterns.adapter;

public class ChristmasTurkey implements Turkey{
  public void gobble(){
    System.out.println("gobble gobble");
  }
  public void fly(){
    System.out.println("flying a littlee");
  }
}

package designPatterns.adapter;

public class MallardDuck implements Duck{
  public void quack(){
    System.out.println("Quackinngggg");
  }
  public void fly(){
    System.out.println("Flying far far away");
  }

}

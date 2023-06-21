package designPatterns.observer;

public class TVDisplay implements Observer{
  @Override
  public void handle(String event) {
    System.out.println("TV Display:" + event);
  }
}

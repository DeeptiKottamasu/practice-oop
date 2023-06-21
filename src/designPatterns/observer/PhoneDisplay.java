package designPatterns.observer;

public class PhoneDisplay implements Observer{
  @Override
  public void handle(String event) {
    System.out.println("Phone Display:" + event);

  }
}

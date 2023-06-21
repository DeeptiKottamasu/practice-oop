package designPatterns;

public abstract class PizzaFactory {
  protected abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type) throws InterruptedException {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    return pizza;
  }
}

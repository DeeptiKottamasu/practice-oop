package designPatterns;

public class PizzaFactoryTest {
  public static void main(String args[]) throws InterruptedException {
    PizzaFactory indianPizzaStore = new IndianPizzaFactory();
    indianPizzaStore.orderPizza("chicken");
    indianPizzaStore.orderPizza("kk");
  }
}

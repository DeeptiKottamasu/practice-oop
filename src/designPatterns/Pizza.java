package designPatterns;

import static java.lang.Thread.sleep;

public abstract class Pizza {
  String name;
  int price;
  String toppings;
  String description;
  void prepare() throws InterruptedException {
    System.out.println("Preparing pizza"+ name);
    System.out.println("Kneading dough.. adding sauce.. adding toppings..");
    System.out.println("Waiting for it to bake...");
    sleep(200);
    System.out.println("Your " + description + " pizza is ready. That will be "+ price);
    System.out.println("Thank you!");

  }


}

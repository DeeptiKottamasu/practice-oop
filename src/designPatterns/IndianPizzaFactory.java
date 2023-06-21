package designPatterns;

public class IndianPizzaFactory extends PizzaFactory{

  public Pizza createPizza(String type){
    if (type == "paneer"){
      return new IndianPaneerPizza();
    }else{
      return new IndianChickenPizza();
    }

  }
}

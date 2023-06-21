package designPatterns.adapter;

import org.junit.jupiter.api.Test;

public class TurkeyAdapterTest {

  @Test
  public void TurkeyAdapterTest(){
    Turkey t = new ChristmasTurkey();
    Duck turkeyAdapater = new TurkeyAdapater(t);
    turkeyAdapater.quack();
    turkeyAdapater.fly();

  }


}

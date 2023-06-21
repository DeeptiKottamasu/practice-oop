package designPatterns.adapter;

public class TurkeyAdapater implements Duck{
  Turkey turkey;
  TurkeyAdapater(Turkey turkey){
    this.turkey = turkey;
  }

  public void quack(){
    turkey.gobble();
  }

  public void fly(){
    for (int i=0; i< 5; i++){
      turkey.fly();
    }
  }

}

package designPatterns.state;

public class Game {
  State state = new WelcomeState(this);

  public Game(){
  }

  public void changeState(State state){
    this.state = state;
  }


}

package designPatterns.state;

public abstract class State {
  Game game;

  public State(Game game){
    this.game = game;
  }
  public abstract void toWelcome();
  public abstract void toPlaying();
  public abstract void toPaused();
  public abstract void toEnd();

}

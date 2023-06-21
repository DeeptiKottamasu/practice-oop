package designPatterns.state;

public class PausedState extends State{
  public PausedState(Game game) {
    super(game);
    System.out.println("In Paused State");
  }

  @Override
  public void toWelcome() {
    System.out.println("Invalid state change");

  }

  @Override
  public void toPlaying() {
    game.changeState(new PlayingState(game));
  }

  @Override
  public void toPaused() {
    System.out.println("Invalid state change");

  }

  @Override
  public void toEnd() {
    System.out.println("Invalid state change");

  }
}

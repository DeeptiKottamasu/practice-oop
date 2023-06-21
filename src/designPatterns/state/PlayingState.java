package designPatterns.state;

public class PlayingState extends State{
  public PlayingState(Game game) {
    super(game);
    System.out.println("In Playing State");
  }

  @Override
  public void toWelcome() {
    game.changeState(new WelcomeState(game));

  }

  @Override
  public void toPlaying() {
    game.changeState(new PlayingState(game));
  }

  @Override
  public void toPaused() {
    game.changeState(new PausedState(game));
  }

  @Override
  public void toEnd() {
    game.changeState(new EndState(game));
  }
}

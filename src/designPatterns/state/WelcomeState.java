package designPatterns.state;

public class WelcomeState extends State{
  public WelcomeState(Game game) {
    super(game);
    System.out.println("In Welcome State");
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
    System.out.println("Invalid state change");

  }

  @Override
  public void toEnd() {
    game.changeState(new EndState(game));

  }
}

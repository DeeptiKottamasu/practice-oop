package designPatterns.state;

public class EndState extends State{
  public EndState(Game game) {
    super(game);
    System.out.println("In End State");
  }

  @Override
  public void toWelcome() {
    System.out.println("Invalid state change");
  }

  @Override
  public void toPlaying() {
    System.out.println("Invalid state change");
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

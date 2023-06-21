package tictactoe;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

  public static void main(String args[]){

    Scanner sc =new Scanner(System.in);
    ArrayList<Player> playerList = new ArrayList<>();
    System.out.println("Welcome to Tic-Tac-Toe");
    System.out.println("Please enter name of first player");
    String name1 = sc.nextLine();
    Player p1 = new Player(name1);
    playerList.add(p1);

    System.out.println("Please enter name of second player");
    String name2 = sc.nextLine();
    Player p2 = new Player(name2);
    playerList.add(p2);

    Game game = new Game(playerList);

    while(true){
      System.out.println(game.getCurrentPlayer().getName() + "Enter next move");
      int row = sc.nextInt();
      int col = sc.nextInt();
      boolean isValid = game.move(row, col);
      if(!isValid){
        System.out.println(game.getCurrentPlayer().getName() + ", your move was invalid.");
        continue;
      }
      GameState state = game.getState();
      if(state== GameState.WON || state== GameState.DRAW)
        break;

      }
    }

}

package tictactoe;

import java.util.ArrayList;
import java.util.Set;

public class Game {
  private ArrayList<Player> players;
  private Board board;
  private String[] pieces = {"X", "O"};
  private int currentPlayerNum;

  Game(ArrayList<Player> players){
    this.players = players;
    int i =0;
    for (Player player: players){
      player.setPiece(pieces[i]);
      i++;
    }
    board = new Board();
    board.printBoard();
    currentPlayerNum = 0;
  }

  public Player getCurrentPlayer(){
    return players.get(currentPlayerNum);
  }

  public boolean move(int row, int col){
    if (board.getVal(row, col) != "-"){
      return false;
    }
    board.setVal(row, col, players.get(currentPlayerNum).getPiece());
    board.printBoard();
    return true;
  }

  public GameState getState(){
    GameState state = board.getState();
    if (state == GameState.DRAW){
      System.out.println(getCurrentPlayer().getName() + " there's a tie, which means your equally good or equally bad. hehe :P");
      return state;
    }
    if (state == GameState.WON){
      System.out.println(getCurrentPlayer().getName() + " has won the game!!! YAYYY");
      return state;
    }
    currentPlayerNum = (currentPlayerNum + 1) % players.size();
    return state;

  }
}


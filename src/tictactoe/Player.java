package tictactoe;

import java.util.UUID;

public class Player {
  private String name;
  private String uuid;
  private String piece;

  public Player(String name){
    this.name = name;
    this.uuid = UUID.randomUUID().toString();
  }
  public String getName(){
    return name;
  }

  public void setPiece(String piece){
    this.piece = piece;
  }

  public String getPiece(){
    return piece;
  }

}

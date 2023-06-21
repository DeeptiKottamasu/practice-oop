package tictactoe;

import java.util.ArrayList;

public class Board {
  private String[][] boardCells;
  private int SIZE =3;
  public Board(){
    this.boardCells = new String[SIZE+1][SIZE+1];
    for (int i=0; i<= SIZE; i++){
      for (int j=0; j<= SIZE; j++){
        boardCells[i][j] = "-";
      }
    }
  }

  public void printBoard(){
    for (int i=0; i< SIZE; i++){
      for (int j=0; j< SIZE; j++){
        System.out.print(boardCells[i][j]);
      }
      System.out.println("");
    }
  }

  public String getVal(int row, int col){
    return boardCells[row][col];
  }

  public void setVal(int row, int col, String val){
    boardCells[row][col] = val;
  }

  public GameState getState(){
    if(winnerInRow()==GameState.WON)
      return GameState.WON;
    if(winnerInColumn()==GameState.WON)
      return GameState.WON;
    if(winnerInFirstDiagonal()==GameState.WON)
      return GameState.WON;
    if(winnerInSecondDiagonal()==GameState.WON)
      return GameState.WON;
    if(gameDrawn()==GameState.DRAW)
      return GameState.DRAW;
    return GameState.PROGRESS;
  }

  private GameState winnerInSecondDiagonal() {
    String current=this.boardCells[0][SIZE];
    if(this.boardCells[0][SIZE].equals("-"))
      return GameState.PROGRESS;
    for(int i=0,j=SIZE -1;i<SIZE && j>=0;i++,j--){
      if(!current.equals(this.boardCells[i][j]) || boardCells[i][j].equals("-"))
        return GameState.PROGRESS;
    }
    return GameState.WON;
  }

  private GameState gameDrawn() {
    for(int i=0;i<SIZE;i++){
      for(int j=0;j<SIZE;j++)
        if(this.boardCells[i][j].equals("-"))
          return GameState.PROGRESS;
    }
    return GameState.DRAW;
  }

  private GameState winnerInFirstDiagonal() {
    String current=this.boardCells[0][0];
    if(this.boardCells[0][0].equals("-"))
      return GameState.PROGRESS;
    for(int i=0;i<SIZE;i++){
      if(!current.equals(this.boardCells[i][i]) || boardCells[i][i].equals("-")) {
        return GameState.PROGRESS;
      }
    }
    return GameState.WON;
  }

  private GameState winnerInColumn() {
    for(int col=0;col<SIZE;col++)
    {
      String current=boardCells[0][col];
      boolean winnerFound=true;
      for(int row=0;row<SIZE;row++) {
        if(!current.equals(boardCells[row][col]) || boardCells[row][col].equals("-")) {
          winnerFound=false;
          break;
        }
      }
      if (winnerFound){
        return GameState.WON;
      }
    }
    return GameState.PROGRESS;
  }

  private GameState winnerInRow() {
    for(int row=0;row<SIZE;row++)
    {
      String current=boardCells[row][0];
      boolean winnerFound=true;
      for(int col=0;col<SIZE;col++) {
        if(!current.equals(boardCells[row][col]) || boardCells[row][col].equals("-")) {
          winnerFound=false;
          break;
        }
      }
      if (winnerFound){
        return GameState.WON;
      }
    }
    return GameState.PROGRESS;
  }
}

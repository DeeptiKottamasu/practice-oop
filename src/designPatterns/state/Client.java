package designPatterns.state;

import java.util.Scanner;

public class Client {
  public static void main(String args[]){
    Game game = new Game();

    Scanner sc = new Scanner(System.in);
    String input = "";
    while(!input.equalsIgnoreCase("exit")){
      System.out.println("Enter next state");
      input = sc.nextLine().trim().toLowerCase();
      System.out.println(input);
      switch(input) {
        case "w":
          game.state.toWelcome();
          break;
        case "p":
          game.state.toPlaying();
          break;
        case "pa":
          game.state.toPaused();
          break;
        case "e":
          game.state.toEnd();
          break;
        default:
          System.out.println("Invalid state");
          break;
      }

    }
  }

}

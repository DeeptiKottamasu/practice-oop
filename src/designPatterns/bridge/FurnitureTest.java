package designPatterns.bridge;

public class FurnitureTest {
  public static void main(String args[]){
    Chair comfy = new Chair(new Wood());
    comfy.getDescription();
    comfy.getQuote();

    Chair cheap = new Chair(new Plastic());
    cheap.getDescription();
    cheap.getQuote();

  }
}

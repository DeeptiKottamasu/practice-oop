package designPatterns.observer;

public class Client {
  public static void main(String args[]){
    WeatherData weather = new WeatherData(22, 10);
    weather.addObservers(new PhoneDisplay());
    weather.addObservers(new TVDisplay());
    weather.change(22, 14);
    weather.change(44, 14);
  }
}

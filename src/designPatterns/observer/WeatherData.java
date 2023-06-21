package designPatterns.observer;

public class WeatherData extends Observable{
  int temparature;
  int humidity;

  public WeatherData(int temparature, int humidity){
    super();
    this.temparature = temparature;
    this.humidity = humidity;
    notifyObservers("Temperature: " + temparature + "; Humidity: " + humidity);
  }

  public void change(int temparature, int humidity){
    boolean changed = false;
    if (temparature != this.temparature){
      this.temparature = temparature;
      changed = true;
    }
    if (humidity != this.humidity){
      this.humidity = humidity;
      changed = true;
    }
    if (changed == true){
      notifyObservers("Temperature: " + temparature + "; Humidity: " + humidity);
    }
  }
}

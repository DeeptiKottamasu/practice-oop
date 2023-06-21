package designPatterns.observer;

import java.util.ArrayList;

public abstract class Observable {
  ArrayList<Observer> observers;

  public Observable(){
    observers = new ArrayList<>();
  }

  public void addObservers(Observer observer){
    observers.add(observer);
  }

  public void removeObservers(Observer observer){
    observers.remove(observer);
  }

  public void notifyObservers(String event){
    for (Observer observer: observers){
      observer.handle(event);
    }
  }

}

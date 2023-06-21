package designPatterns;

public class Singleton {

  private static Singleton syncInstance;

  private Singleton(){

  }

  public static Singleton getSyncInstance(){
    if (syncInstance == null){
      synchronized (Singleton.class){
        if (syncInstance == null){
          syncInstance = new Singleton();
        }
      }

    }
    return syncInstance;
  }
}

package designPatterns;

public class SingletonTest {

  public static void main(String args[]){

    Singleton s1 = Singleton.getSyncInstance();
    Singleton s2 = Singleton.getSyncInstance();
    System.out.println(s1);
    System.out.println(s2);

  }
}

package javagradle;

public class Runner {

  private Player player;

  public void run() {
    while (true) {
      try {
        System.out.println("This is running");
        Thread.sleep(50);
      } catch (InterruptedException e) {
      }
    }
  }
}

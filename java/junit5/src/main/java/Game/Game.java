package Game;

public class Game {

  private boolean tickCalled;

  public void start() {


  }

  public String view() {
    if (tickCalled) {
      return """
        ---
        --x
        ---""";
    }
    return """
        ---
        -x-
        ---""";
  }

  public void tick() {
    tickCalled = true;
  }
}

package Game;

public class SnakeAsciiArtConsoleGame {

  private final Arena arena;
  private int snakeRow;
  private int snakeColumn;

  public SnakeAsciiArtConsoleGame(Arena arena) {
    this.arena = arena;
  }

  public void start() {
    snakeRow = 1;
    snakeColumn = 1;
  }

  public String asciiArtRepresentation() {
    StringBuilder strb = new StringBuilder();
    for (int row = 0; row < arena.height(); row++) {
      for (int column = 0; column < arena.width(); column++) {
        if (row == snakeRow && column == snakeColumn) {
          strb.append("x");
        } else {
          strb.append("-");
        }
      }
      strb.append("\n");
    }
    return strb.toString();
  }

  public void tick() {
    snakeColumn = snakeColumn + 1;
  }
}

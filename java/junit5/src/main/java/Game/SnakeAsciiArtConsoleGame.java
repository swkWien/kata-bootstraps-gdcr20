package Game;

public class SnakeAsciiArtConsoleGame {

  private final Arena arena;
  private final Snake snake;

  public SnakeAsciiArtConsoleGame(Arena arena, Snake snake) {
    this.arena = arena;
    this.snake = snake;
  }

  public String asciiArtRepresentation() {
    StringBuilder strb = new StringBuilder();
    for (int row = 0; row < arena.height(); row++) {
      for (int column = 0; column < arena.width(); column++) {
        if (row == snake.row() && column == snake.column()) {
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
    snake.move();
  }
}

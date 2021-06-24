package Game;

public class SnakeAsciiArtConsoleGame {

  private int arenaHeigth;
  private int arenaWidth;
  private int snakeRow;
  private int snakeColumn;

  public void start() {
    arenaHeigth = 3;
    arenaWidth = 3;
    snakeRow = 1;
    snakeColumn = 1;
  }

  public String asciiArtRepresentation() {
    StringBuilder strb = new StringBuilder();
    for (int row = 0; row < arenaHeigth; row++) {
      for (int column = 0; column < arenaWidth; column++) {
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

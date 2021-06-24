package Game;

public class Snake {

  private int row = 1;
  private int column = 1;

  public int row() {
    return row;
  }

  public int column() {
    return column;
  }

  public void move() {
    this.column = this.column + 1;
  }
}

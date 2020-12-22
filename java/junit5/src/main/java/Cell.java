public class Cell {
  private int x;
  private int y;
  private boolean isAlive;
  private int numberOfNeighbours;

  public Cell(int x, int y, boolean isAlive){
    this.x = x;
    this.y = y;
    this.isAlive = isAlive;
  }

  public boolean getIsAlive(){
    return this.isAlive;
  }
}

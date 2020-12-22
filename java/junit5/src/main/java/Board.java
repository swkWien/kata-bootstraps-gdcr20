public class Board {

  private Cell cells[][];
  private int width;
  private int height;
  public Board(int width, int height){
    this.height = height;
    this.width = width;
    cells = new Cell[width][height];
  }
  public Cell[][] getCells(){
    return cells;
  }
  public int getWidth(){
    return width;
  }
  public int getHeight(){
    return getHeight();
  }

  public Cell getCell(int height, int width){
    return cells[height][width];
  }
}

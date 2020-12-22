import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {

  @Test
  public void createBoardTest(){
    Board board = new Board(5,5);
    Board setBoard = Game.createGrid(board,3);
    int counter  = 0;
    for(int i =0; i<setBoard.getHeight(); i++){
      for(int j = 0; i< setBoard.getWidth(); j++){
        if(setBoard.getCell(i,j).getIsAlive()){
          counter++;
        }
      }
    }
    assertEquals(3,counter);
  }
}

import static org.junit.jupiter.api.Assertions.assertEquals;

import Game.Snake;
import org.junit.jupiter.api.Test;

public class SnakeTest {

  @Test
  void initial() {
    final Snake snake = new Snake();

    assertEquals(1, snake.column());
    assertEquals(1, snake.row());
  }

  @Test
  void after_move() {
    final Snake snake = new Snake();

    snake.move();

    assertEquals(2, snake.column());
  }
}

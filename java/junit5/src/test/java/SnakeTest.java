import static org.junit.jupiter.api.Assertions.assertEquals;

import Game.Snake;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import java.util.List;
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

  @Test
  void initial_with_snake_of_length_2() {
    final Snake snake = new Snake(2);

    assertEquals(List.of(new Tuple2(1,1), new Tuple2(1,0)), snake.body());
  }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
1. Snake direction
2. Moving and check resulting coordinates
 */
public class SnakeTest {

  @Test
  public void setDirectonTest() {
    Snake snake = new Snake();
    snake.setDirection(Direction.RIGHT);

    assertEquals(snake.getDirection(), Direction.RIGHT);
  }
}

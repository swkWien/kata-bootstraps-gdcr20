import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
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

  @Test
  public void cannot_change_direction_180_degrees() {
    Snake snake = new Snake();
    assertThat(snake.setDirection(Direction.DOWN)).isFalse();
  }
}

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
  public void cannotChangeDirection180Degrees() {
    Snake snake = new Snake();
    assertThat(snake.setDirection(Direction.DOWN)).isFalse();
  }

  @Test
  public void moveSnakeTest() {
    Snake snake = new Snake();
    snake.setDirection(Direction.RIGHT);
    snake.moveTick();
    assertThat(snake.getHeadPosX()).isEqualTo(26);
    assertThat(snake.getHeadPosY()).isEqualTo(25);
  }
}

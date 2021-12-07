import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakeTest {

  @Test
  void new_snake_head_is_at_position_zero() {
    Snake snake = new Snake();
    Position head = snake.getHead();
    assertThat(head.getX()).isEqualTo(0);
    assertThat(head.getY()).isEqualTo(0);
  }

  @Test
  void new_snake_has_length_one() {
    Snake snake = new Snake();
    assertThat(snake.getPositions().size()).isEqualTo(1);
  }

  @Test
  void if_snake_moves_up_head_moves_one_up() {
    Snake snake = new Snake();
    snake = snake.move(Movement.UP);
    Position head = snake.getHead();
    assertThat(head.getX()).isEqualTo(0);
    assertThat(head.getY()).isEqualTo(1);
  }

  @Test
  void if_snake_moves_up_and_right_head_moves_appropriately() {
    Snake snake = new Snake();
    snake = snake.move(Movement.UP);
    snake = snake.move(Movement.RIGHT);
    Position head = snake.getHead();
    assertThat(head.getX()).isEqualTo(1);
    assertThat(head.getY()).isEqualTo(1);
  }

  @Test
  void if_snake_moves_up_and_down_head_moves_only_up() {
    Snake snake = new Snake();
    snake = snake.move(Movement.UP);
    snake = snake.move(Movement.DOWN);
    Position head = snake.getHead();
//    assertThat(head.getX()).isEqualTo(0);
    assertThat(head.getY()).isEqualTo(1);
  }

}

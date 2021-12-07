import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakeTest {
    @Test
    public void creatingSnake() {
        assertThat(SnakeService.createSnake(new Position(1, 1))).isInstanceOf(Snake.class);
    }

    @Test
    public void after_moving_up_the_head_changes_position() {
        Snake snake = SnakeService.createSnake(new Position(1, 1));
        SnakeService.moveSnakeUp(snake);
    }
}

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakeTest {
    @Test
    public void snake() {
        Snake snake = new Snake(new Coordinates(1, 1));
        snake.up();
        assertThat(snake.getPosition()).isEqualTo(new Coordinates(0,1));
    }
}

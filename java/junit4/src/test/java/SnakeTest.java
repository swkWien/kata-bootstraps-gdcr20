import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakeTest {
    @Test
    public void snake() {
        Shape shape = new Shape();
        shape.add(new Coordinates(1, 1));
        Snake snake = new Snake(shape);
        snake.up();
        assertThat(snake.getHeadPosition()).isEqualTo(new Coordinates(0,1));
    }

    @Test
    public void longerSnake() {
        Shape shape = new Shape();
        shape.add(new Coordinates(1, 1));
        shape.add(new Coordinates(1, 2));
        Snake snake = new Snake(shape);
        snake.up();
        assertThat(snake.getHeadPosition()).isEqualTo(new Coordinates(0,1));
        Shape expectedShape = new Shape();
        shape.add(new Coordinates(0, 1));
        shape.add(new Coordinates(1, 1));
        assertThat(expectedShape).isEqualTo(snake.getShape());
    }
}

import static org.junit.Assert.assertEquals;

import com.sun.tools.javac.util.List;
import org.junit.Test;

public class SnakeTest {

    @Test
    public void moveSnake() {
        Snake snake = new Snake(List.of(new Cell(1, 1), new Cell(0, 1)));

        Snake movedSnake = Snake.move(snake, Direction.UP);
        Snake expectedSnake = new Snake(List.of(new Cell(2, 1), new Cell(1, 1)));
        assertEquals(expectedSnake, movedSnake);
    }
}

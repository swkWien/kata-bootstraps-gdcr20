import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

public class ThingTest {

    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertEquals("Food", value);
    }

    @Test
    void it_should_not_fail() {
        assertTrue(true);
    }

    @Test
    void snakeHasNoOppositeDirectionsOnConsecutiveSquares() {
        Snake snake = new Snake(5);
        snake.push(new Square("up"));
        snake.push(new Square("up"));
        Assertions.assertThrows(InvalidDirectionException.class, () -> snake.push(new Square("down")));
    }
}

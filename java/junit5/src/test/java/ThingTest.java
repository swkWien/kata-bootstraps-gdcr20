import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;


class ThingTest {

    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value)
                .isEqualTo("Food");
    }

    @Test
    void it_should_not_fail() {
        assertThat(42)
                .isEqualTo(42);
    }

    @Test
    void snakeHasNoOppositeDirectionsOnConsecutiveSquares() {
        Snake snake = new Snake(5);
        snake.push(new Square("up"));
        snake.push(new Square("up"));
        Assertions.assertThrows(InvalidDirectionException.class, () -> snake.push(new Square("down")));
    }
}

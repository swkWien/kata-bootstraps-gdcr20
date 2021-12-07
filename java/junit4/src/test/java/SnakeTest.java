import org.assertj.core.util.diff.myers.Snake;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakeTest {
    @Test
    public void creatingSnake() {
        assertThat(SnakeCreator.creates()).isInstanceOf(Snake.class);
    }
}

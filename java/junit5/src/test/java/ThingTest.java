import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ThingTest {

    interface Game {
        void tick();
    }

    @Test
    void helloWorldGetsCalledFiveTimes() {
        Object gameDriver = newGameDriver();
        Game game = Mockito.mock(Game.class);
        gameDriver.run(game);

        Mockito.verify(game, Mockito.times(5));
    }
}

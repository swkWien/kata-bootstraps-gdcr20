import Game.Game;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SnakeTest {

    @Test
    void initial_game_view() {
        Game game = new Game();

        game.start();

        Approvals.verify(game.view());
    }

    @Test
    void game_after_one_tick() {
        Game game = new Game();
        game.start();

        game.tick();

        Approvals.verify(game.view());
    }
}

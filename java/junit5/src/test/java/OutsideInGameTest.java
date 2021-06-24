import Game.Arena;
import Game.SnakeAsciiArtConsoleGame;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OutsideInGameTest {

    private SnakeAsciiArtConsoleGame game;

    @BeforeEach
    void setUp() {
        game = new SnakeAsciiArtConsoleGame(new Arena());

        game.start();
    }

    @Test
    void initial_game_view() {
        Approvals.verify(game.asciiArtRepresentation());
    }

    @Test
    void game_after_one_tick() {
        game.tick();

        Approvals.verify(game.asciiArtRepresentation());
    }
}

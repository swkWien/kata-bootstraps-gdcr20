import Game.SnakeAsciiArtConsoleGame;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class SnakeTest {

    @Test
    void initial_game_view() {
        var game = new SnakeAsciiArtConsoleGame();

        game.start();

        Approvals.verify(game.asciiArtRepresentation());
    }

    @Test
    void game_after_one_tick() {
        var game = new SnakeAsciiArtConsoleGame();
        game.start();

        game.tick();

        Approvals.verify(game.asciiArtRepresentation());
    }
}

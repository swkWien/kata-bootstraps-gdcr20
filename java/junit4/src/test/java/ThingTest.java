import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThingTest {

    // von aussen nach innen

    public class GameMain {

        public String run(String string) {
            if ("-v".equals(string)) {
                String version = "Game of Live 1.0";
                return version + "\n";
            }
            
            return "___\n___\n___\n";
        }

    }

    @Test
    public void shouldHaveCommandLineVersion() {
        GameMain main = new GameMain();
        String output = main.run("-v");
        assertEquals("Game of Live 1.0\n", output);
    }

    @Test
    public void shouldStartGame() {
        GameMain main = new GameMain();
        String output = main.run("-start -tick 0 -size 3");
        assertEquals("___\n___\n___\n", output);
    }
}

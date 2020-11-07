import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.Ignore;
import org.junit.Test;

public class ThingTest {

    // von aussen nach innen

    public class GameMain {

        public String run(String string) {
            if ("-v".equals(string)) {
                String version = "Game of Live 1.0";
                return version + "\n";
            }
            String[] args = string.split(" ");

            int size = Stream.of(args). //
                    filter(a -> a.startsWith("-size=")). //
                    map(a -> a.substring("-size=".length())). //
                    map(Integer::parseInt). //
                    findFirst(). //
                    get();

            long c = Stream.of(args). //
                    filter(a -> a.startsWith("-seed=")). //
                    map(a -> a.substring(6)). //
                    map(seed -> seed.split(",")). //
                    // map(xy -> grid[xy[0], xy[1]] = true
                    count();
            if (c > 0) {
                return "___\n_x_\n___\n";
            }

            String o = "";
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    o += "_";
                }
                o += "\n";
            }
            return o;
        }

    }

    @Test
    public void shouldHaveCommandLineVersion() {
        GameMain main = new GameMain();
        String output = main.run("-v");
        assertEquals("Game of Live 1.0\n", output);
    }

    @Test
    public void shouldStartGameSize3() {
        GameMain main = new GameMain();
        String output = main.run("-tick=0 -size=3");
        assertEquals("___\n___\n___\n", output);
    }

    @Test
    public void shouldStartGameSize2() {
        GameMain main = new GameMain();
        String output = main.run("-tick=0 -size=2");
        assertEquals("__\n__\n", output);
    }

    // size 4
    // ticks 1

    @Test
    public void shouldSeedGame() {
        GameMain main = new GameMain();
        String output = main.run("-seed=1,1 -tick=0 -size=3");
        assertEquals("___\n" + //
                "_x_\n" + //
                "___\n", output);
    }

}

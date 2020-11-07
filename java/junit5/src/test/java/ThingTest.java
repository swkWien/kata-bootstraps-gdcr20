import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ThingTest {

    interface Output {
        void printLine(String message);
    }

    class StdOut implements Output {
        @Override
        public void printLine(String message) {
            System.out.println(message);
        }
    }

    class Game {
        private Output output;

        public Game(Output output) {
            this.output = output;
        }

        void tick() {
            this.output.printLine("Output String");
        }
    }

    @Test
    void gameUsesOutputForWritingLines() {
        Output output = Mockito.mock(Output.class);
        Game newGame = new Game(output);
        newGame.tick();

        Mockito.verify(output).printLine("Output String");
    }
}

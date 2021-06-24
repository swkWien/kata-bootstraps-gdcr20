import static org.junit.jupiter.api.Assertions.assertEquals;

import Game.Arena;
import org.junit.jupiter.api.Test;

public class ArenaTest {

  @Test
  void arena_default_dimensions() {
    final Arena arena = new Arena();
    assertEquals(3, arena.width());
    assertEquals(3, arena.height());
  }
}

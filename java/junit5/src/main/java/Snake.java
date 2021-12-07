import java.util.ArrayDeque;
import java.util.Deque;

public class Snake {
  Deque<Position> positions = new ArrayDeque<>();

  public Snake() {
    positions.addFirst(new Position(0,0));
  }

  public Snake(Deque<Position> positions) {
    this.positions = positions;
  }

  public Deque<Position> getPositions() {
    return positions;
  }

  public Position getHead() {
    return positions.getFirst();
  }

  public Snake move(Movement move) {
    Position oldHead = positions.getFirst();
    Position oldNeck = positions.stream().skip(1).findFirst().orElse(oldHead);
    Position newHead = new Position(oldHead.getX() + move.getX(), oldHead.getY() + move.getY());
    if(newHead.equals(oldNeck)) {
      return this;
    }
    positions.addFirst(newHead);
    return new Snake(positions);
  }

}

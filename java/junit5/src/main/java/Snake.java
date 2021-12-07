import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class Snake extends ArrayDeque<Square> {
  public Snake() {
  }

  public Snake(int numElements) {
    super(numElements);
  }

  @Override
  public void push(Square o) {
    Set<String> directions = new HashSet<>();
    directions.add(o.getDirection());
    Square prev = peek();
    directions.add(prev == null ? "" : prev.getDirection());
    Set<String> forbidden = new HashSet<>();
    forbidden.add("Up");
    forbidden.add("Down");
    if (directions.containsAll(forbidden)) {
      throw new InvalidDirectionException();
    }
    super.push(o);
  }
}

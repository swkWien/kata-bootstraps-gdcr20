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
  public void push(Square newSquare) throws InvalidDirectionException {

    Square prev = peek();
    if (!checkAllowedDirection(newSquare, prev)) {
      throw new InvalidDirectionException();
    }
    super.push(newSquare);
  }

  private boolean checkAllowedDirection(Square newSquare, Square prev) {
    if (prev == null) {
      return true;
    }
    return !newSquare.getDirection().equals(Util.getOppositeDirection(prev.getDirection()));
  }
}

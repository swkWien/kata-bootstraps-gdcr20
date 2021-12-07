public class Snake {
  private Direction direction = Direction.UP;

  public Snake() {
  }

  public Direction getDirection() {
    return direction;
  }

  public boolean setDirection(Direction direction) {
    this.direction = direction;
    return true;
  }
}

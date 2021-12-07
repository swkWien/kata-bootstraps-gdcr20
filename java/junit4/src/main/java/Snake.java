public class Snake {
  private Direction direction = Direction.UP;
  private int headPosX = 25;
  private int headPosY = 25;

  public Snake() {
  }

  public Direction getDirection() {
    return direction;
  }

  public boolean setDirection(Direction newDirection) {
    if (this.direction.isInvalidTo(newDirection)) {
      return false;
    }
    this.direction = newDirection;
    return true;
  }

  public int getHeadPosX() {
    return headPosX;
  }

  public int getHeadPosY() {
    return headPosY;
  }

  public void moveTick() {
    if (direction == Direction.RIGHT) {
      headPosX++;
    }
  }
}

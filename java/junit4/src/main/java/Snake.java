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
    if ((this.direction == Direction.UP && newDirection == Direction.DOWN)
        || (this.direction == Direction.RIGHT && newDirection == Direction.LEFT)
        || (this.direction == Direction.DOWN && newDirection == Direction.UP)
        || (this.direction == Direction.LEFT && newDirection == Direction.RIGHT)) {
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

  }
}

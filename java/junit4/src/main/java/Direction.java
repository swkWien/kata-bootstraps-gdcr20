public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    private Direction invalid;
    static {
        UP.invalid = DOWN;
        DOWN.invalid = UP;
        LEFT.invalid = RIGHT;
        RIGHT.invalid = LEFT;
    }

    public boolean isInvalidTo(Direction direction) {
        return direction == invalid;
    }
}

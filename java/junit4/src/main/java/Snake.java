public class Snake {
    private Shape shape;

    public Snake(Shape shape) {
        this.shape = shape;
    }

    public void up() {
        shape.up();
    }

    public Coordinates getHeadPosition() {
        return shape.first();
    }

    public Shape getShape() {
        return shape;
    }
}

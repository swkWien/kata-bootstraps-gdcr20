import java.util.Objects;
import java.util.StringJoiner;

public class Coordinates {

    private int row;
    private int col;

    public Coordinates(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Coordinates up() {
        return new Coordinates(row - 1, col);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coordinates that = (Coordinates) o;
        return row == that.row && col == that.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Coordinates.class.getSimpleName() + "[", "]")
                .add("row=" + row)
                .add("col=" + col)
                .toString();
    }
}

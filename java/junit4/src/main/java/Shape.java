import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Shape {
    public List<Coordinates> coords = new ArrayList<>();

    public void add(Coordinates coordinates) {
        coords.add(coordinates);
    }

    public Coordinates first() {
        return coords.get(0);
    }

    public void up() {
        coords = coords.stream()
                .map(Coordinates::up)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        for (int i = 0; i < coords.size(); i++) {
            if (!coords.get(i).equals(shape.coords.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coords);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Shape.class.getSimpleName() + "[", "]")
                .add("coords=" + coords)
                .toString();
    }
}

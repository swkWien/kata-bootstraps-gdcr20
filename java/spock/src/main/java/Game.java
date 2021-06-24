import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Field> fields;

    public Game(int n, int m) {
        this.fields = seed(n, m);
    }

    private ArrayList<Field> seed(int n, int m) {
        ArrayList<Field> fields = new ArrayList<>();
        fields.add(new Field() {});
        return fields;
    }

    public List<Field> getFields() {
        return fields;
    }
}

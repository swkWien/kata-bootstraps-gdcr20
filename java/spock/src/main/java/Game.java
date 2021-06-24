import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Field> fields;

    public Game(int n, int m) throws IllegalArgumentException {
        this.fields = seed(n, m);
    }

    private ArrayList<Field> seed(int n, int m) throws IllegalArgumentException {
        if (n < 1 || m < 1) {
            throw new IllegalArgumentException();
        }
        ArrayList<Field> fields = new ArrayList<>();
        for (int i = 0; i < n * m; i++) {
            fields.add(new Field() {
                @Override
                public String getType() {
                    return "empty";
                }
            });
        }
        return fields;
    }

    public List<Field> getFields() {
        return fields;
    }

    public Field fieldAt(int n, int m) {
        return this.fields.get(0);
    }
}

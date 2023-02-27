import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public String toString() {
        StringBuilder herdString = new StringBuilder();
        for (Movable movable : herd) {
            herdString.append(movable.toString()).append("\n");
        }
        return herdString.toString();
    }


    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }
}

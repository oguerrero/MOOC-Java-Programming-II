import java.util.ArrayList;

public class Hideout {
    private int capacity;
    private ArrayList<String> hideout;

    public Hideout(int capacity) {
        this.capacity = capacity;
        this.hideout = new ArrayList<>();
    }

    public void putIntoHideout(String toHide) {
        if (this.hideout.size() < this.capacity) {
            this.hideout.add(toHide);
        }
    }

    public String takeFromHideout() {
        if (this.hideout.isEmpty()) {
            return null;
        }

        String item = this.hideout.get(this.hideout.size() - 1);
        this.hideout.remove(this.hideout.size() - 1);
        return item;
    }

    public boolean isInHideout(String toFind) {
        return this.hideout.contains(toFind);
    }
}

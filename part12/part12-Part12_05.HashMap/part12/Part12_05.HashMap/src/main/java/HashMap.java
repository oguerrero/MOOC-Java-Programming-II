import java.util.ArrayList;

public class HashMap {
    private ArrayList<String> keys;
    private ArrayList<String> values;

    public HashMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void add(String key, String value) {
        this.keys.add(key);
        this.values.add(value);
    }

    public String get(String key) {
        if (this.keys.contains(key)) {
            return this.values.get(this.keys.indexOf(key));
        }
        return null;
    }

    public boolean containsKey(String key) {
        return this.keys.contains(key);
    }

    public void remove(String key) {
        if (this.keys.contains(key)) {
            this.values.remove(this.keys.indexOf(key));
            this.keys.remove(key);
        }
    }

    public ArrayList<String> keys() {
        return this.keys;
    }
}

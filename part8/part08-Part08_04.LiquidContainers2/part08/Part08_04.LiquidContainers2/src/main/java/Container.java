public class Container {
    private int amount;
    private final int capacity;

    public Container() {
        this.amount = 0;
        this.capacity = 100;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.amount += amount;
        if (this.amount > this.capacity) {
            this.amount = this.capacity;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.amount -= amount;
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}

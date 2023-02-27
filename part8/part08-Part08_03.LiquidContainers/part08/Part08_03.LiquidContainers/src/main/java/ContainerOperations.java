public class ContainerOperations {
    private int first;
    private int second;
    
    public ContainerOperations() {
        this.first = 0;
        this.second = 0;
    }
    
    public int getFirst() {
        return first;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.first += amount;
            if (this.first > 100) {
                this.first = 100;
            }
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > this.first) {
                amount = this.first;
            }
            this.first -= amount;
            this.second += amount;
            if (this.second > 100) {
                this.second = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.second -= amount;
            if (this.second < 0) {
                this.second = 0;
            }
        }
    }
    public void action(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];
        int amount = Integer.parseInt(parts[1]);

        switch (command) {
            case "add":
                add(amount);
                break;
            case "move":
                move(amount);
                break;
            case "remove":
                remove(amount);
                break;
        }
    }
}

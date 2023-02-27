public class ContainerOperations {
    private final Container first;
    private final Container second;

    public ContainerOperations() {
        this.first = new Container();
        this.second = new Container();
    }
    
    public int getFirst() {
        return this.first.contains();
    }
    
    public int getSecond() {
        return this.second.contains();
    }
    
    public void add(int amount) {
        this.first.add(amount);
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > this.first.contains()) {
                amount = this.first.contains();
            }
            this.first.remove(amount);
            this.second.add(amount);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.second.remove(amount);
        }
    }
    public void actions(String input) {
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

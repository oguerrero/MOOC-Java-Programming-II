package FlightControl;

public class Flight {
    private String id;
    private String departure;
    private String target;

    public Flight(String id, String departure, String target) {
        this.id = id;
        this.departure = departure;
        this.target = target;
    }

    public String getId() {
        return this.id;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getTarget() {
        return this.target;
    }

    @Override
    public String toString() {
        return this.id + " (" + this.departure + "-" + this.target + ")";
    }
}

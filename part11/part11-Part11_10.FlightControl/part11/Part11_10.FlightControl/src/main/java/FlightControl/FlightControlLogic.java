package FlightControl;

import java.util.ArrayList;
import java.util.List;

public class FlightControlLogic {
    List<Airplane> airplanes;
    List<Flight> flights;

    public FlightControlLogic() {
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void printAirplanes() {
        for (Airplane airplane : this.airplanes) {
            System.out.println(airplane);
            System.out.println();
        }
    }

    public void printFlights() {
        for (Flight flight : this.flights) {
            System.out.println(flight);
            System.out.println();
        }
    }

    public void printAirplaneInfo(String id) {
        for (Airplane airplane : this.airplanes) {
            if (airplane.getId().equals(id)) {
                System.out.println(airplane);
            }
        }
    }
}

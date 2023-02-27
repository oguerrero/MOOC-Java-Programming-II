package FlightControl;

import java.util.Scanner;

public class TextUI {

    private final FlightControlLogic logic;
    private final Scanner scanner;

    public TextUI(FlightControlLogic logic, Scanner scanner) {
        this.logic = logic;
        this.scanner = scanner;
    }

    public void start( ) {
        assetControl();
        flightControl();
    }

    public void assetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                addAirplane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void flightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                logic.printAirplanes();
            } else if (command.equals("2")) {
                logic.printFlights();
            } else if (command.equals("3")) {
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                logic.printAirplaneInfo(id);
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        Airplane airplane = new Airplane(id, capacity);
        logic.addAirplane(airplane);
    }

    public void addFlight() {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.print("Give the departure airport id: ");
        String departure = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String target = scanner.nextLine();
        Flight flight = new Flight(id, departure, target);
        logic.addFlight(flight);
    }
}


package FlightControl;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControlLogic logic = new FlightControlLogic();
        TextUI ui = new TextUI(logic, scanner);
        ui.start();
    }
}

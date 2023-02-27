
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContainerOperations containerOperations = new ContainerOperations();

        while (true) {
            System.out.println("First: " + containerOperations.getFirst() + "/100");
            System.out.println("Second: " + containerOperations.getSecond() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            containerOperations.action(input);
        }
    }
}

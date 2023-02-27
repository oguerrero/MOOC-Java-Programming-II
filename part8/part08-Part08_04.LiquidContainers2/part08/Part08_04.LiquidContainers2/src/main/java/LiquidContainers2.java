
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContainerOperations operations = new ContainerOperations();

        while (true) {
            System.out.println("First: " + operations.getFirst() + "/100");
            System.out.println("Second: " + operations.getSecond() + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            operations.actions(input);
        }

        scan.close();
    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }
        double sum = 0;
        list.stream().mapToInt(Integer::valueOf).average().ifPresent(avg -> System.out.println("average of the numbers: " + avg));
    }
}

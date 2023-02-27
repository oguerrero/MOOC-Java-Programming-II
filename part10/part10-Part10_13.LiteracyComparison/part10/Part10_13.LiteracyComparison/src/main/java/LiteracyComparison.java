
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> p1[5].compareTo(p2[5]))
                    .forEach(row -> lines.add(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1] + ", " + row[5]));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        lines.forEach(System.out::println);
    }
}

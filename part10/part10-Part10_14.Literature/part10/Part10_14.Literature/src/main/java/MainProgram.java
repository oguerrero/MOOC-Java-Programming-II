import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            books.add(new Book(name, age));
        }

        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");

        books.stream()
                .sorted((b1, b2) -> {
                    if (b1.getAgeRec() == b2.getAgeRec()) {
                        return b1.getName().compareTo(b2.getName());
                    }

                    return b1.getAgeRec() - b2.getAgeRec();
                })
                .forEach(System.out::println);

        scanner.close();
    }
}

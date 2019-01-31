package DatyCzas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzy nowe wydarzenie");
        System.out.println("Podaje datę w formacie dd-MM-yyyy");

        DateTimeFormatter datePatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateInput = sc.nextLine();
        LocalDate createdDate = LocalDate.parse(dateInput,datePatter);
        System.out.println("Wydarzenie utworzone na dzień " + createdDate);
    }
}

package ReferencjeDoMetod.Zadanie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("Karol","Wojtek","Alicja","Bartek","Romek");

       names.sort(String::compareToIgnoreCase);
       names.forEach(System.out::println);
    }
}

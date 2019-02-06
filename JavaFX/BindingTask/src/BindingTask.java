import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Scanner;

public class BindingTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second = new SimpleIntegerProperty();
        second.bind(first);
        second.addListener(((observable, oldValue, newValue) -> System.out.println("Zmiana w second " + newValue) ));

        System.out.println("Pierwsza liczba");
        first.set(sc.nextInt());
        sc.nextLine();

        System.out.println("Druga liczba");
        first.set(sc.nextInt());
        sc.nextLine();

        sc.close();
    }
}

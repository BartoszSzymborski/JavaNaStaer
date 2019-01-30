package ReferencjeDoMetod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PeopleGenerator {
    public static void main(String[] args) {
        List<Person>people = generate(10,Person::new);
        people.forEach(System.out::println);
    }

    private static <T> List<T>generate(int num, Supplier<T>supplier){
        List<T>result = new ArrayList<>();
        for (int i = 0; i <num ; i++) {
            result.add(supplier.get()) ;
        }
        return result;
    }

}

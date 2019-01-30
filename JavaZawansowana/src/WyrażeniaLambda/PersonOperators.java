package WyrażeniaLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonOperators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan","Kowalski",42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        consumeList(people, p -> System.out.println(p));
        System.out.println(">>>");
        applayToList(people,p->{
            p.setAge(p.getAge()+1);
            return p;
        });
        consumeList(people,p-> System.out.println(p));
        System.out.println(">>>");
        filterByPredicate(people,p->p.getAge()>18);

    }

    private static <T> void applayToList(List<T>list, Function<T,T> pre){
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,pre.apply(list.get(i)));
        }
    }
    private static <T> void consumeList(List<T>list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }

    private static <T> void filterByPredicate(List<T>list, Predicate<T>pre){
        for (T t : list ){
            if (pre.test(t)){
                System.out.println(t);
            }
        }
    }
}

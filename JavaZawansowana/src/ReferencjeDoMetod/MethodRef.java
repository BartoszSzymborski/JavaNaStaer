package ReferencjeDoMetod;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodRef {
    public static void main(String[] args) {
        String name[] = { "Kowalski", "Abacki", "Wojnarek", "Bednarek", "Krzywousty" };
        Arrays.sort(name, MethodRef::sortAscending);
        consumeArray(name,System.out::println);

        System.out.println(">>>");
        Arrays.sort(name,MethodRef::sortDescendin);
        consumeArray(name,System.out::println);
    }

    private static <T> void consumeArray(T[] arr, Consumer<T>consumer){
        for (T t : arr){
            consumer.accept(t);
        }
    }
    private static int sortAscending(String s1, String s2){
        return s1.compareTo(s2);
    }
    private static int sortDescendin(String s1, String s2){
        return s2.compareTo(s1);
    }
}

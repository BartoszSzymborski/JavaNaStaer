package PrzetwarzanieKolekcji;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStreams {
    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.iterate(0,x->x+1);

        List<Integer>squareNumbers = numStream.map(NumberStreams::square)
                .limit(100)
                .collect(Collectors.toList());

        Set<Integer>biggerThan5 = squareNumbers.stream()
                .filter(NumberStreams::isDividedBy)
                .map(NumberStreams::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("List");
        squareNumbers.forEach(x-> System.out.println(x+ "; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x-> System.out.println(x+ "; "));
    }

    private static  int square(int x){
        return x*x;
    }
    private static boolean isDividedBy(int x){
        return x% DIVIDER ==0;
    }
    private static int divide (int x){
        return x/DIVIDER;
    }
}

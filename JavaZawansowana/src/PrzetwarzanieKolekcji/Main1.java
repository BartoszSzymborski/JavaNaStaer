package PrzetwarzanieKolekcji;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main1 {
    private static final int DIVIDER = 10;

    public static void main(String[] args) {
        List<Integer>squareNumbers = IntStream.range(0,100)
                .map(Main1::square)
                .boxed()
                .collect(Collectors.toList());


        Set<Integer>biggerThan5 = squareNumbers.stream()
                .filter(Main1::isDividedBy)
                .map(Main1::divide)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("List");
        squareNumbers.forEach(x-> System.out.println(x + "; "));
        System.out.println("\nSet");
        biggerThan5.forEach(x-> System.out.println(x + "; "));


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

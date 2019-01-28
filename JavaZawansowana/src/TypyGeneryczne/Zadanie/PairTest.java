package TypyGeneryczne.Zadanie;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Ania", 1987);
        Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
        Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");

        print(p1);
        print(p2);
        print(p3);

    }

    static <T, V> void print(Pair<T, V> pair) {
        System.out.println("<"+pair.getT()+" ; "+ pair.getV()+">");
    }
}

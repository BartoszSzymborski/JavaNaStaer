package Rekurencje;

public class OddTester {
    public static void main(String[] args) {
        checNumber(10);
        checNumber(11);
    }

    static void checNumber(int n) {
        String check = n % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(n + " " + check);
    }
}

package WyrażeniaLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        List<Integer>ints = new ArrayList<>();
        Random r = new Random();
        generate(ints,50,()->r.nextInt(1000));
        for (int n : ints){
            System.out.println(n);
        }
    }

    private static <T> void generate(List<T> list, int num, Supplier<T>supplier){
        for (int i = 0; i <num ; i++) {
            list.add(supplier.get());
        }
    }
}

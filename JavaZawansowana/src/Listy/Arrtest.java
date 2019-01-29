package Listy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Arrtest {
    public static void main(String[] args) {
        Integer[]ints = {5,10,15};
        List<Integer>lista = Arrays.asList(ints);
        for (Integer num : lista){
            System.out.println(num);
        }
    }
}

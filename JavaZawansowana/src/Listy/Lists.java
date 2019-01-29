package Listy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        //ArrayList<Integer>ints = new ArrayList<>();
        LinkedList<Integer>ints = new LinkedList<>();
        for (int i = 0; i <100 ; i++) {
            ints.add(i);
        }
        System.out.println("ints.get(50) "+ ints.get(50));
        System.out.println("Ilość elementów na liście: "+ ints.size());
        System.out.println("Czyszczenie tablicy ");
        ints.clear();
        System.out.println("Ilość elementów na liście po czyszczeniu: " + ints.size());
    }
}

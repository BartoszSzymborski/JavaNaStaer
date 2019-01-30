package Iteratory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemoveException {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

       Iterator<String>namesIterator = names.iterator();
       while (namesIterator.hasNext()){
           String name = namesIterator.next();
           System.out.println(name);
           if (name.equals("Kasia")){
               namesIterator.remove();
           }
       }
    }
}

package Zbiory.Zadanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameReader {
    public static void main(String[] args) {
        TreeSet<String>names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.compareTo(o2));
            }
        });

        try (Scanner sc = new Scanner(new File("namepsl.txt"))){
            while (sc.hasNextLine()){
                names.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Ilość imion w zbiorze: " + names.size());
        System.out.println("Pierwsze imię " + names.first());
        System.out.println("Ostatnie imie " + names.last());
    }
}

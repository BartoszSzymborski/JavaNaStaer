package Listy.Zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    private static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double>numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);
    }

    static void fillList(List<Double>list){
        System.out.println("Podaj kolejną liczbę (lub exit zeby zakończyć)");
        String input = sc.nextLine();
        if (input.equals(SumNumbers.EXIT))
            return;

        try {
            Double num = Double.valueOf(input);
            list.add(num);
        }catch (NumberFormatException e){
            System.err.println("Liczba w niepoprawnum formacie");
        }
        fillList(list);
    }
    static void printData(List<Double>list){
        StringBuilder sb = new StringBuilder();
        double sum = 0;
        for (double d: list){
            sb.append(d);
            sb.append("+");
            sum+=d;
        }
        sb.replace(sb.length()-1,sb.length(),"=");
        sb.append(sum);
        System.out.println(sb.toString());
    }
}

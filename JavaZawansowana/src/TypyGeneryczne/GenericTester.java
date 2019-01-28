package TypyGeneryczne;

public class GenericTester {
    public static void main(String[] args) {
        Container<Integer>integer = new Container<Integer>();
        integer.setArray(new Integer[5]);
        integer.getArray()[0] = 5;

        Container<String>strings = new Container<String>();
        strings.setArray(new String[10]);
        strings.getArray()[0] = "Ania";
        strings.getArray()[1] = "Basia";

        Integer num = integer.get(0);
        String str = strings.get(0);

        System.out.println(num);
        System.out.println(str);
    }
}

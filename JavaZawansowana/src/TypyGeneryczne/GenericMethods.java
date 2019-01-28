package TypyGeneryczne;

public class GenericMethods {
    public static void main(String[] args) {
        print5Times(2);
        print5Times("Krzysio");
    }

    public static <T>void print5Times(T arg){
        for (int i = 0; i <5 ; i++) {
            System.out.println(arg);
        }
    }
}

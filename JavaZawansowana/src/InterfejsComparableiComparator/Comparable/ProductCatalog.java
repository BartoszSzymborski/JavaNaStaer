package InterfejsComparableiComparator.Comparable;

import java.util.Arrays;

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino","Zupa pomidorowa","Zupy");
        products[1] = new Product("Amino","Zupa ogórkowa","Zupy");
        products[2] = new Product("Winiary","Zupa pomidorowa","Zupy");
        products[3] = new Product("Winiary","Zupa pomidorowa","Zupy błyskawiczne");
        products[4] = new Product("Winiary","Rosół","Zupy");
        products[5] = new Product("Knorr","Placki ziemniaczane","Dania obiadowe");
        products[6] = new Product("Knorr","Racuchy","Dania obiadowe");

        System.out.println("Nieposortowana");
        for (Product p : products){
            System.out.println(p);
        }
        Arrays.sort(products);
        System.out.println("Posortowana");
        for (Product p : products){
            System.out.println(p);
        }

    }
}

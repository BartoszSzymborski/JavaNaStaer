package TypyOpakowujące;

import java.math.BigDecimal;

public class BigNumbers {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println(b-a);

        BigDecimal aBig = BigDecimal.valueOf(a);
        BigDecimal bBig = BigDecimal.valueOf(b);
        System.out.println(aBig.subtract(bBig));
    }
}

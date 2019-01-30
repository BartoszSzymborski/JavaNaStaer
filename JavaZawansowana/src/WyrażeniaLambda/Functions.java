package WyrażeniaLambda;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, String> func = text->text.toLowerCase().trim();
        String original = "WIELKI NAPIS";
        String toLowerCaseTrim = func.apply(original);
        System.out.println(toLowerCaseTrim);
    }
}

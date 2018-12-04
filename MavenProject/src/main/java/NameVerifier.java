import org.apache.commons.lang3.StringUtils;
/**
 * Klasa testowa dla zarządzania zależnościami i wpinania pluginów do cyklu
 * budowania aplikacji
 *
 * @author Slawek
 *
 */
public class NameVerifier {
    public static void main(String[] args) {
        String name = "Maciek";
        System.out.println(StringUtils.isAlpha(name));
    }
    /**
     * Metoda dodająca dwie liczby całkowite
     *
     * @param a
     * @param b
     * @return suma parametrów a i b
     */
    public int add(int a, int b) {
        return a + b;
    }
}

package Colletions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColletionOperation {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";

        List<String>words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista oryginalna");
        printColletions(words);

        Collections.shuffle(words);
        System.out.println("Lista shuffle");
        printColletions(words);

        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista sort");
        printColletions(words);

        int position = Collections.binarySearch(words,"drukarki");
        System.out.println("Słowo\"drukarki\"jest w liście na " + position + " miejscu");
        int freq = Collections.frequency(words,"strona");
        System.out.println("Słowo \"strona\" występuje na liście " + freq + " razy");
        System.out.println("Najmniejszy element w liście to " + Collections.min(words));
    }

    static void printColletions(Collection<String> colletion){
        for (String s : colletion){
            System.out.println(s + "; ");
        }
        System.out.println();
    }

}

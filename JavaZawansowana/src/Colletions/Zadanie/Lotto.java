package Colletions.Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private List<Integer>numbers;
    private static final int MAX_NUMBERS = 6;
    private static final int NO_OF_NUMBERS = 49;

    public Lotto(){
        numbers = new ArrayList<>();
        generate();
    }
    private void generate(){
        for (int i = 1; i <NO_OF_NUMBERS ; i++) {
            numbers.add(i);
        }
    }
    public void randomize(){
        Collections.shuffle(numbers);
    }

    public int checkResult(List<Integer>userNumbers){
        List<Integer>lottoResult = numbers.subList(0,6);

        System.out.println("Wunik loosowania: ");
        for (Integer num : lottoResult){
            System.out.println(num + " ");
        }
        System.out.println();

        int found = 0;
        for (int i = 0; i <MAX_NUMBERS ; i++) {
            if (lottoResult.contains(userNumbers.get(i))){
                found++;
            }
        }
        return found;
    }
}

package TypyOpakowujące;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int a = 0, b = 0, c = 0;
        BigInteger aBig = null, bBig = null;

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
        ) {
            a = Integer.valueOf(br.readLine());
            b = Integer.valueOf(br.readLine());
            c = Integer.valueOf(br.readLine());
            aBig = new BigInteger(br.readLine());
            bBig = new BigInteger(br.readLine());
            System.out.println("a+b+c " + (a+b+c));
            System.out.println("aBig + bBig " + (aBig.add(bBig)));
        }catch (FileNotFoundException e){
            System.err.println("Nie znaleziono pliku");
        }catch (IOException e){
            System.err.println("Błąd odczytu danych");
        }
    }
}

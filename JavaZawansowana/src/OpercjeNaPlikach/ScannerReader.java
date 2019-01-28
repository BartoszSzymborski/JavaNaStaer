package OpercjeNaPlikach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        int lines = 0;
        while (scan.hasNextLine()){
            String text = scan.nextLine();
            System.out.println(text);
            lines++;
        }
        System.out.println("Ilość wierszy w pliku " + lines);
        scan.close();

    }
}

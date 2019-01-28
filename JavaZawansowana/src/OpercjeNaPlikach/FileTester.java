package OpercjeNaPlikach;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileTester {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            while ((nextLine = bufferedReader.readLine())!=null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku " + lines);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader!=null)
                    bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

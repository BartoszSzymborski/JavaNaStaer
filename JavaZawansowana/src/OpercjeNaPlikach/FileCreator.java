package OpercjeNaPlikach;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public static void main(String[] args) {

        String fileName = "textFile.txt";
        File file = new File(fileName);

        boolean fileExists = file.exists();
        if (!fileExists){
            try {
                fileExists = file.createNewFile();
            }catch (IOException e){
                System.out.println("Nie udało się utworzyć żądanego pliku");
            }
        }

        if (fileExists)
            System.out.println("Pilik " + fileName + " już istnieje");

    }
}

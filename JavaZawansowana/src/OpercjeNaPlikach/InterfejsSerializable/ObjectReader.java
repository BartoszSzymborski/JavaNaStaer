package OpercjeNaPlikach.InterfejsSerializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ){
            p1 = (Person) ois.readObject();
        }catch (ClassNotFoundException | IOException e){
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }
        if (p1!=null){
            System.out.println("Wczytano dane");
            System.out.println(p1.getFirstName()+" " + p1.getLastName());
        }
    }
}

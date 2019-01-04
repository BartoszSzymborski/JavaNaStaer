package pl.javastart.projekt2.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DevicrentApp {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("test2");
        emFactory.close();
    }
}

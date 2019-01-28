package OpercjeNaPlikach.Zadanie;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {

    public static final String FILE_STORE = "employees.info";
    public static final int READ_FROM_USER = 1;
    public static final int READ_FROM_FILE = 2;

    public static void main(String[] args) {
        Company company = new Company();

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadzanie dane pracowników " + READ_FROM_USER);
        System.out.println("Wczytanie danych pracowników " + READ_FROM_FILE);

        int option = input.nextInt();

        if (option==READ_FROM_USER){
            writeData(company);
        }else if (option == READ_FROM_FILE){
            readData(company);
        }
        input.close();
    }

    private static void writeData(Company company){
        try(
                Scanner sc = new Scanner(System.in);
                FileOutputStream fos = new FileOutputStream(FILE_STORE);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){
            for (int i = 0; i <Company.EMPLOYEES ; i++) {
                System.out.println("Wprowadź imię: ");
                String fn = sc.nextLine();
                System.out.println("Wprowadź nazwisko: ");
                String ln = sc.nextLine();
                System.out.println("Wporowadź wypłątę: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                company.add(new Employee(fn,ln,salary),i);

            }
            oos.writeObject(company);
        }catch (IOException e){
            System.err.println("Błąd zapisu do pliku");
            e.printStackTrace();
        }
    }

    private static void readData(Company company){
        try(
                FileInputStream fis = new FileInputStream(FILE_STORE);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ){
            company = (Company)ois.readObject();

            for (int i = 0; i <Company.EMPLOYEES ; i++) {
                System.out.println(company.getEmployees()[i]);

            }
        }catch (IOException | ClassNotFoundException e){
            System.err.println("Błąd odczytu danych");
            e.printStackTrace();
        }
    }
}

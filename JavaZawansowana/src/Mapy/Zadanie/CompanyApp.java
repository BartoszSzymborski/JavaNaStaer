package Mapy.Zadanie;

import java.util.Scanner;

public class CompanyApp {

    private static final int ADD_EMPLOYEE = 0;
    private static final int FINAL_EMPLOYEE = 1;
    private static final int EXIT = 2;

    private static Company company = new Company();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int userOption;
            do {
                printOptions();
                userOption = sc.nextInt();
                sc.nextLine();

                switch (userOption) {
                    case CompanyApp.ADD_EMPLOYEE:
                        addEmployee(sc);
                        break;
                    case CompanyApp.FINAL_EMPLOYEE:
                        findAndPrintEmployee(sc);
                        break;
                    case CompanyApp.EXIT:
                        break;
                }
            }
            while (userOption != CompanyApp.EXIT);
        }
    }

    private static void printOptions() {
        System.out.println("0 - dodawanie pracownika");
        System.out.println("1 - wyszukowanie pracownika");
        System.out.println("2 - wyjście z programu");
    }

    private static void addEmployee(Scanner sc) {
        Employee employee = new Employee();

        System.out.println("Dodawaie praciwnika");
        System.out.println("Imię: ");
        employee.setFirstName(sc.nextLine());
        System.out.println("Nazwisko: ");
        employee.setLastName(sc.nextLine());
        System.out.println("Pensja: ");
        employee.setSalary(sc.nextDouble());
        sc.nextLine();

        company.addEmployee(employee);
    }

    private static void findAndPrintEmployee(Scanner sc) {
        System.out.println("Wyszukiwanie pracownika");
        System.out.println("Podaj imię");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = sc.nextLine();

        Employee employee = company.getEmployee(firstName, lastName);
        System.out.println(employee);
    }
}

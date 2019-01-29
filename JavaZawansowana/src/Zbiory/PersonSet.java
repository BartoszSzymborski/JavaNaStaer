package Zbiory;

import java.util.HashSet;

public class PersonSet {
    public static void main(String[] args) {
        HashSet<Person>persons = new HashSet<>();

        persons.add(new Person("Jan","Kowalski"));
        persons.add(new Person("Jan","Kowalski"));
        persons.add(new Person("Ania","Kawalec"));
        persons.add(new Person("Ania","Kawalec"));
        persons.add(new Person("Szymon","Zalewski"));

        System.out.println("Persons size: "+ persons.size());
        System.out.println("contains Jan Kowalski? " + persons.contains(new Person("Jan","Kowalski")));
        persons.remove(new Person("Ania","Kawalec"));
        System.out.println("Person size: " + persons.size());

    }
}

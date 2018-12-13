package pl.javastart.model;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Person {
    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email
    private String emial;

    @Min(1)
    private int age;

    public Person(String firstName, String lastName, String emial, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emial = emial;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emial='" + emial + '\'' +
                ", age=" + age +
                '}';
    }
}

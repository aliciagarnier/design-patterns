package org.example.builder;

import java.time.LocalDate;

public class Person {

    private String name;

    private String lastName;

    private String email;

    private LocalDate birthdate;


    Person(String name, String lastName, String email, LocalDate birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.birthdate = birthdate;
    }

public static class PersonBuilder {

    private String name;

    private String lastName;

    private String email;

    private LocalDate birthdate;


    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonBuilder birthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public Person build() {
        return new Person(name, lastName, email, birthdate);
    }

  }

}

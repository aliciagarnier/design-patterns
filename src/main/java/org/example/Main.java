package org.example;


import org.example.builder.Animal;
import org.example.builder.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Person person = new Person.PersonBuilder().name("Alicia")
               .lastName("Garnier")
               .birthdate(LocalDate.now())
               .email("alicia@email.com")
               .build();

        System.out.println(person);

        Animal animal = Animal.builder().name("Horse").breed("Shire").build();
    }
}
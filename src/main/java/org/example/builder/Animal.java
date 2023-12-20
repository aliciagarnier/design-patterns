package org.example.builder;


import lombok.Builder;
import lombok.Setter;
import lombok.Getter;

@Getter @Setter
@Builder

public class Animal {

    private String name;

    private String breed;
}

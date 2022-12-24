package com.victor.educacao.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}

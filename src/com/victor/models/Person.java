package com.victor.models;

public abstract class Person implements Comparable<Person> {
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.getName());
    }
}

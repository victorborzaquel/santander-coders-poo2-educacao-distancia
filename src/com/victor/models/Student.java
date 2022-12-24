package com.victor.models;

public abstract class Student extends Person {
    private String studing;
    protected Student(String name, String studing) {
        super(name);
        this.studing = studing;
    }

    public String getStuding() {
        return studing;
    }

    public void setStuding(String studing) {
        this.studing = studing;
    }
}

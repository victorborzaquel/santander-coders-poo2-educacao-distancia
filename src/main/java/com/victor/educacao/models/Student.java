package com.victor.educacao.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Student extends Person {
    private String studing;
    protected Student(String name, String studing) {
        super(name);
        this.studing = studing;
    }
}

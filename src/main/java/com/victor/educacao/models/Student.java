package com.victor.educacao.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public abstract class Student extends Person {
    private String studing;
    private Integer registration;
    protected Student(Integer registration, String name, String studing) {
        super(name);
        this.registration = registration;
        this.studing = studing;
    }
}

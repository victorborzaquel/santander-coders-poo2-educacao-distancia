package com.victor.educacao.entities;

import com.victor.educacao.models.Student;

public class JavaStudent extends Student {
    public JavaStudent(Integer registration, String name) {
        super(registration, name, "Java");
    }
}

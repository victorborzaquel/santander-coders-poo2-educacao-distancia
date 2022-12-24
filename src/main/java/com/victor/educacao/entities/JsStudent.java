package com.victor.educacao.entities;

import com.victor.educacao.models.Student;

public class JsStudent extends Student {
    public JsStudent(Integer registration, String name) {
        super(registration, name, "JavaScript");
    }
}

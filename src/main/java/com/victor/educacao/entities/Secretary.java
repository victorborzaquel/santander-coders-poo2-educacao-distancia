package com.victor.educacao.entities;

import com.victor.educacao.models.Person;
import com.victor.educacao.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Secretary extends Person {
    private final List<Classroom<Student>> classrooms = new ArrayList<>();

    public Secretary(String name) {
        super(name);
    }

    public void addClassroom(Classroom<Student> classroom) {
        classrooms.add(classroom);
    }

    public List<Classroom<Student>> getClassrooms() {
        return classrooms;
    }
}

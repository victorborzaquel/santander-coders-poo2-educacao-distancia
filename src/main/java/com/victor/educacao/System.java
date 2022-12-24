package com.victor.educacao;

import com.victor.educacao.entities.*;
import com.victor.educacao.enums.Course;
import com.victor.educacao.services.StudentService;
import com.victor.educacao.services.StudentsClassroomService;
import com.victor.educacao.utils.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class System {
    public static void main(String[] args) {
        Secretary secretary = new Secretary("Maria");

        secretary.enrollClassroom(
                new Teacher("Kadu"),
                new JavaStudent(1, "Victor"),
                new JavaStudent(2, "Thiago"),
                new JavaStudent(3, "Jose")
        );

        secretary.enrollClassroom(
                new Teacher("Kadu"),
                new JsStudent(1, "Joao"),
                new JsStudent(2, "Leomin"),
                new JsStudent(3, "Bruna")
        );

        List<String> javaStudents = secretary.sortStudentsByName(Course.JAVA);
        List<String> jsStudents = secretary.sortStudentsByRegistration(Course.JAVASCRIPT);

        Print.partition("java", javaStudents);
        Print.partition("javascript", jsStudents);
    }
}

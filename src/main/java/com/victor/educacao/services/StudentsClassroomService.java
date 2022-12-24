package com.victor.educacao.services;

import com.victor.educacao.entities.Classroom;
import com.victor.educacao.models.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsClassroomService {
    public static void sortStudentsByName(Classroom<?> classroom) {
        classroom.getStudents().sort(Comparator.comparing(Student::getName));
    }

    public static void sortStudentsByRegistration(Classroom<?> classroom) {
        classroom.getStudents().sort(Comparator.comparing(Student::getRegistration));
    }

    public static <T extends Student> void addStudent(Classroom<T> classroom, T aluno) {
        classroom.getStudents().add(aluno);
    }

    public static <T extends Student> void addStudents(Classroom<T> classroom, List<T> alunos) {
        classroom.getStudents().addAll(alunos);
    }

}

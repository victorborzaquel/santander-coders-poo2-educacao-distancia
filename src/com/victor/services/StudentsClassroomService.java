package com.victor.services;

import com.victor.entities.Classroom;
import com.victor.models.Student;

import java.util.Collections;
import java.util.List;

public class StudentsClassroomService {
    public static void sortStudentsByName(Classroom<?> classroom) {
        Collections.sort(classroom.getStudents());
    }

    public static <T extends Student> void addStudent(Classroom<T> classroom, T aluno) {
        classroom.getStudents().add(aluno);
    }

    public static <T extends Student> void addStudents(Classroom<T> classroom, List<T> alunos) {
        classroom.getStudents().addAll(alunos);
    }

}

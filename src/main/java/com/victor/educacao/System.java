package com.victor.educacao;

import com.victor.educacao.entities.Classroom;
import com.victor.educacao.entities.JavaStudent;
import com.victor.educacao.entities.JsStudent;
import com.victor.educacao.entities.Teacher;
import com.victor.educacao.services.StudentService;
import com.victor.educacao.services.StudentsClassroomService;
import com.victor.educacao.utils.Print;

import java.util.List;

public class System {
    public static void main(String[] args) {
        List<JavaStudent> javaStudents = StudentService.createJavaStudent("Victor", "Thiago", "Jose");
        Classroom<JavaStudent> javaClassroom = Classroom.<JavaStudent>builder()
                .teacher(new Teacher("Kadu"))
                .students(javaStudents)
                .build();

        List<JsStudent> jsStudents = StudentService.createJsStudent("Joao", "Leomin", "Bruna");
        Classroom<JsStudent> jsClassroom = new Classroom<>();
        jsClassroom.setTeacher(new Teacher("Gabriela"));
        StudentsClassroomService.addStudents(jsClassroom, jsStudents);

        StudentsClassroomService.sortStudentsByName(javaClassroom);

        Print.partition("java", javaClassroom);
        Print.partition("javascript", jsClassroom);
    }
}

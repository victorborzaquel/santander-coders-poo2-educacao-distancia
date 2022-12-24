package com.victor;

import com.victor.entities.*;
import com.victor.services.StudentService;
import com.victor.services.StudentsClassroomService;
import com.victor.utils.Print;

import java.util.List;

public class System {
    public static void main(String[] args) {
        List<JavaStudent> javaStudents = StudentService.createJavaStudent("Victor", "Thiago", "Jose");
        Classroom<JavaStudent> javaClassroom = new Classroom.Builder<JavaStudent>()
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

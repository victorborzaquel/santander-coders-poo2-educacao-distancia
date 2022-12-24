package com.victor.educacao.entities;

import com.victor.educacao.enums.Course;
import com.victor.educacao.models.Person;
import com.victor.educacao.models.Student;
import com.victor.educacao.services.StudentsClassroomService;
import lombok.Getter;

import java.util.*;

@Getter
public class Secretary extends Person {
    private final List<Classroom<Student>> classrooms = new ArrayList<>();
    private Classroom<JsStudent> jsClassroom;
    private Classroom<JavaStudent> javaClassroom;

    public Secretary(String name) {
        super(name);
    }

    public void enrollClassroom(Teacher teacher, JavaStudent... students) {
        javaClassroom = new Classroom.Builder<JavaStudent>()
                .teacher(teacher)
                .students(Arrays.asList(students))
                .build();
    }

    public void enrollClassroom(Teacher teacher, JsStudent... students) {
        jsClassroom = new Classroom.Builder<JsStudent>()
                .teacher(teacher)
                .students(Arrays.asList(students))
                .build();
    }

    public Student getStudentByRegistration(Integer registration, Course course) {
        return switch (course) {
            case JAVA -> searchStudentByRegistration(javaClassroom, registration);
            case JAVASCRIPT -> searchStudentByRegistration(jsClassroom, registration);
        };
    }

    private Student searchStudentByRegistration(Classroom<? extends Student> classroom, Integer registration) {
        return classroom
                .getStudents()
                .stream()
                .filter(student -> student.getRegistration().equals(registration))
                .findFirst()
                .orElse(null);
    }

    public String getStudentInfo(Integer registration, Course course) {
        return getStudentByRegistration(registration, course).toString();
    }

    public List<String> getStudentsInfo(Course course) {
        return switch (course) {
            case JAVA -> javaClassroom.getStudents().stream().map(Student::toString).toList();
            case JAVASCRIPT -> jsClassroom.getStudents().stream().map(Student::toString).toList();
        };
    }

    public List<String> sortStudentsByName(Course course) {
        switch (course) {
            case JAVA -> StudentsClassroomService.sortStudentsByName(javaClassroom);
            case JAVASCRIPT -> StudentsClassroomService.sortStudentsByName(jsClassroom);
        }

        return getStudentsInfo(course);
    }

    public List<String> sortStudentsByRegistration(Course course) {
        switch (course) {
            case JAVA -> StudentsClassroomService.sortStudentsByRegistration(javaClassroom);
            case JAVASCRIPT -> StudentsClassroomService.sortStudentsByRegistration(jsClassroom);
        }

        return getStudentsInfo(course);
    }
}

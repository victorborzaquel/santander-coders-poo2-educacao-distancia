package com.victor.entities;

import com.victor.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Classroom<T extends Student> {
    private Teacher teacher;
    private final List<T> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }

    private Classroom(Teacher teacher, List<T> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<T> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return String.format("Turma={teacher=%s, students=%s}", teacher, students);
    }

    public static class Builder<T extends Student> {
        private Teacher teacher;
        private final List<T> students = new ArrayList<>();

        public Builder<T> teacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public Builder<T> addStudent(T student) {
            students.add(student);
            return this;
        }

        public Builder<T> students(List<T> students) {
            this.students.addAll(students);
            return this;
        }

        public Classroom<T> build() {
            return new Classroom<>(teacher, students);
        }
    }
}

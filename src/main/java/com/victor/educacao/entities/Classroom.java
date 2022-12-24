package com.victor.educacao.entities;

import com.victor.educacao.models.Student;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Classroom<T extends Student> {
    private Teacher teacher;
    @Singular private final List<T> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }

    public static class Builder<T extends Student> {
        private Teacher teacher;
        private final List<T> students = new ArrayList<>();

        public Builder<T> teacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public Builder<T> student(T student) {
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

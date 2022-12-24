package com.victor.educacao.entities;

import com.victor.educacao.models.Student;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Classroom<T extends Student> {
    private Teacher teacher;
    @Singular private final List<T> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }
}

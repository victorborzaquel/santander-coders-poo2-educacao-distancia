package com.victor.services;

import com.victor.entities.JavaStudent;
import com.victor.entities.JsStudent;

import java.util.Arrays;
import java.util.List;

public class StudentService {
    public static List<JavaStudent> createJavaStudent(String... names) {
        return Arrays.stream(names).map(JavaStudent::new).toList();
    }

    public static List<JsStudent> createJsStudent(String... names) {
        return Arrays.stream(names).map(JsStudent::new).toList();
    }
}

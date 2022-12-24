package com.victor.utils;

import java.util.List;

public class Print {
    private Print() {
        throw new IllegalStateException("Utility class");
    }

    private static final Integer WIDTH = 80;

    public static void partition() {
        System.out.println("-".repeat(WIDTH));
    }
    public static void partition(String title) {
        int lineWidth = (WIDTH - title.length()) / 2;
        String line = "-".repeat(lineWidth);
        System.out.println(line + title.toUpperCase() + line);
    }
    public static void partition(String title, Object o) {
        Print.partition(title);
        System.out.println(o);
        Print.partition();
    }

    public static void partition(String title, List<Object> listO) {
        Print.partition(title);
        listO.forEach(System.out::println);
        Print.partition();
    }
}

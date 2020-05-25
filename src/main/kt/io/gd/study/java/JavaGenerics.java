package io.gd.study.java;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.get(0).toUpperCase();

        List list1 = new ArrayList<>();
        list.add("Goodbye");

        List<String> strings = new ArrayList<>();
        strings.add("hello");

        // Generic is compile time feature, so can't do List<String>
        boolean b = strings instanceof List;
    }
}

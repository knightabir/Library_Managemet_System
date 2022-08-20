package com.abir;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(65);
        list.add(58);
        list.add(57);
        System.out.println(list);
        System.out.println(list.contains(54));
        list.set(0,99);
        System.out.println(list);
    }
}

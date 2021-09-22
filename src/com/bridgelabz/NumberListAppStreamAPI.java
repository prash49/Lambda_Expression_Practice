package com.bridgelabz;

import java.util.ArrayList;

public class NumberListAppStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        // creating stream  and Iterate the Each item to show each element of stream
        list.stream().forEach(item -> System.out.println(item));
    }
}

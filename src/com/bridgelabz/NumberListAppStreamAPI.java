package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class NumberListAppStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        // UC2.1 creating stream  and Iterate the Each item to show each element of stream
        list.stream().forEach(item -> System.out.println(item));

        // UC 2.5
        Function<Integer,Double> doubleFunction = (n) -> n.doubleValue();
        List<Double>  doubleList = list.stream().map(doubleFunction).peek(n -> System.out.println(n)).collect(Collectors.toList());
     System.out.println(doubleList);
    }
}

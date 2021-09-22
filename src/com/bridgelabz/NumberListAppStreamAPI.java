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

        // UC2.2 converting and Storing
        List<Double> doubleList = new ArrayList<>(); // for storing
        Function<Integer, Double> doubleFunction = (n) -> n.doubleValue();
        list.stream().forEach(item -> doubleList.add(doubleFunction.apply(item)));// converting & Storing
        System.out.println(doubleList);

        // UC2.3 Storing the result from above Function From result Double list
        // to another list by using collection
        List<Double> listOfDouble = doubleList.stream().collect(Collectors.toList());
        System.out.println(listOfDouble);

        //UC2.4  filtering the even data from the list and storing in another list
        List<Double> evenList = new ArrayList<>();
        Predicate<Integer> isEvenFunction = (n) -> n % 2 == 0;
        listOfDouble.stream().forEach(item -> {
            if (isEvenFunction.test(item.intValue())) {
                evenList.add(item);
            }
        });
        System.out.println("original list: " + list);
        System.out.println("Convetred list: " + listOfDouble);
        System.out.println("Filtered List:  " + evenList);
    }
}
